package bmstu;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class AirportsMapper extends Mapper<LongWritable, Text, AirportWritableComparable, Text>{

    public static final int ID = 0;
    public static final int DESCRIPTION = 1;
    public static final int AIRPORT_FLAG = 0;
    public static final String SEPARATOR = "\",\"";
    public static final String REGEX_REPLACE = "\"";

    @Override
    protected void map(LongWritable key, Text value,
                       Mapper<LongWritable, Text, AirportWritableComparable, Text>.Context context)
            throws IOException, InterruptedException {
        String table = value.toString();
        String[] values = table.split(SEPARATOR);
        if (key.get() > 0) {
            int airportId = Integer.parseInt(deleteQuotes(values[ID]));
            String airportName = deleteQuotes(values[DESCRIPTION]);
            context.write(new AirportWritableComparable(airportId, AIRPORT_FLAG), new Text(airportName));
        }
    }


    private String deleteQuotes(String str) {
        return str.replaceAll(REGEX_REPLACE, "");
    }
}
