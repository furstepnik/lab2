package bmstu;

import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class AirportWritableComparable implements WritableComparable<AirportWritableComparable> {

    int airportId;
    int data;

    @Override
    public int compareTo(AirportWritableComparable o) {
        int airportIdCompare;
        if (airportId != o.airportId) {
            airportIdCompare = airportId 
        }
        return 0;
    }

    @Override
    public void write(DataOutput out) throws IOException {
        out.writeInt(airportId);
        out.writeInt(data);
    }

    @Override
    public void readFields(DataInput in) throws IOException {
        airportId = in.readInt();
        data = in.readInt();
    }
}
