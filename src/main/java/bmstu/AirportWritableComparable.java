package bmstu;

import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class AirportWritableComparable implements WritableComparable<AirportWritableComparable> {

    int airportId;
    int data;

    public AirportWritableComparable() {

    }

    public AirportWritableComparable (int airportId, int data) {
        this.airportId = airportId;
        this.data = data;
    }

    @Override
    public int compareTo(AirportWritableComparable o) {
        int airportIdCompare;
        if (airportId != o.airportId) {
            airportIdCompare = airportId > o.airportId ? 1 : -1;
        } else {
            airportIdCompare = 0;
        }
        if (airportIdCompare != 0) {
            return airportIdCompare;
        } else {
            return Integer.compare(data, o.data);
        }
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

    public int getAirportId () {
        return 
    }
}
