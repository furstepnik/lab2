package bmstu;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import java.io.IOException;
import java.util.Iterator;

public class AirportReducer extends Reducer<AirportWritableComparable, Text, Text, Text> {
    @Override
    protected void reduce(AirportWritableComparable key, Iterable<Text> values, Context context) throws
            IOException, InterruptedException {
        float delayMax = 0;
        float delayMin = Float.MAX_VALUE;
        int flightCount = 0;
        float delaySum = 0.0f;
        Iterator<Text> iter = values.iterator();
        if (iter.hasNext()) {
            Text airportName = new Text(iter.next());
            while (iter.hasNext()) {
                float delay = Float.parseFloat(())
            }

    }


}
