package bmstu;

import org.apache.hadoop.mapreduce.Partitioner;

import javax.xml.soap.Text;

public class AirportPartitioner extends Partitioner<AirportWritableComparable, Text> {

    @Override
    public int getPartition(AirportWritableComparable airportWritableComparable, Text text, int numPartitions) {
        return 0;
    }
}
