package bmstu;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class AirportGroupingComparator extends WritableComparator {
    public AirportGroupingComparator() {
        super(AirportWritableComparable.class, true);
    }

    @Override
    public int compare(WritableComparable a, WritableComparable b) {
        AirportWritableComparable keyA = (AirportWritableComparable) a;
        AirportWritableComparable keyB = (AirportWritableComparable) b;
        return Integer.compare(keyA.getAirportId(), keyB.getAirportId());
    }
}
