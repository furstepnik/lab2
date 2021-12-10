package bmstu;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.LongWritable;


public class AirportsMapper extends Mapper<LongWritable, Text, AirportWritableComparable, Text>{

}
