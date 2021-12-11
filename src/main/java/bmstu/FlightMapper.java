package bmstu;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class FlightMapper extends Mapper<LongWritable, Text, AirportWritableComparable, Text> {

    public static final int DELAY_POSITION = 18;
    public static final int AIRPORT_ID_POSITION = 14;
    public static final int CANCELLED_STATUS_POSITION = 19;
    public static final float CANCELLED = 1.0f;
    public static final int FLIGHT_FLAG = 1;
    public static final String SEPARATOR = ",";
    @Override
    protected void map(LongWritable key, Text value,
                       Mapper<LongWritable, Text, AirportWritableComparable, Text>.Context context)
            throws IOException, InterruptedException {
        String table = value.toString();
        String[] values = table.split(SEPARATOR);
        if (key.get()>0) {
            String delay = values[DELAY_POSITION];
            int airportId = Integer.parseInt(values[AIRPORT_ID_POSITION]);
            boolean delayCheck = (Float.parseFloat(values[CANCELLED_STATUS_POSITION])==CANCELLED);
            if (!delayCheck) {
                if ((!delay.isEmpty()) && (Float.parseFloat(delay)>0f)) {
                    context.write(new AirportWritableComparable(airportId, FLIGHT_FLAG), new Text(values[DELAY_POSITION]));
                }
            }
        }
    }
}
