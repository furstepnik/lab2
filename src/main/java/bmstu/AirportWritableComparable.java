package bmstu;

import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class AirportWritableComparable implements WritableComparable<AirportWritableComparable> {

    private int airportID;
    private int data;

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeInt(airportID);
        out.writeInt(data);
    }

    @Override
    public void readFields(DataInput in) throws IOException {
        airportID = in.readInt();
        data = in.readInt();
    }

    @Override
    public int compareTo(AirportWritableComparable o) {
        

        return 0;
    }
}
