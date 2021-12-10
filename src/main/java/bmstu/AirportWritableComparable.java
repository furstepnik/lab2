package bmstu;

import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class AirportWritableComparable implements WritableComparable<AirportWritableComparable> {

    @Override
    public int compareTo(AirportWritableComparable o) {
        return 0;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeInt();
    }

    @Override
    public void readFields(DataInput in) throws IOException {

    }
}
