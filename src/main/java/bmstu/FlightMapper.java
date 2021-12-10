package bmstu;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class FlightMapper extends Mapper<LongWritable, Text, AirportWritableComparable, Text> {

    public static final int DELAY_POSITION = 18;
    public static final int AIRPORT_ID_POSITION = 14;
    @Override
    protected void map(LongWritable key, Text value,
                       Mapper<LongWritable, Text, AirportWritableComparable, Text>.Context context)
            throws IOException, InterruptedException {
        String table = value.toString();
        String values[] = table.split(",");
        if (key.get()>0) {
            String delay = values[DELAY_POSITION];
            String airportId = values[AIRPORT_ID_POSITION];
            boolean delayCheck = (Float.parseFloat(values[DELAY_POSITION+1])==1.0f);
            if (delayCheck) {
                context.write(new AirportWritableComparable(airportId,1), new Text());
            }


        }
    }
}
