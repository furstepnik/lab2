package bmstu;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class FlightMapper extends Mapper<LongWritable, Text, AirportWritableComparable, Text> {
    @Override
    protected void map(LongWritable key, Text value,
                       Mapper<LongWritable, Text, AirportWritableComparable, Text>.Context context)
            throws IOException, InterruptedException {
        String table = value.toString();
        String values[] = table.split(",");
        
    }
}
