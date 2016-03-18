package mensuration.units.length;

import mensuration.converter.lengthConverter.FeetToMeter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FeetTest {

    @Test
    public void convert() {
        Meter meter = new Meter(0.3048);
        Feet feet = new Feet(1);
        assertEquals(meter,feet.convert(new FeetToMeter()));
    }
}