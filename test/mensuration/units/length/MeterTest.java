package mensuration.units.length;

import mensuration.converter.lengthConverter.MeterToCentimeter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MeterTest {

    @Test
    public void convertToCentimeter() {
        Meter meter = new Meter(1);
        Centimeter centimeter = new Centimeter(100);
        assertEquals(centimeter,meter.convertToCentimeter());
    }

    @Test
    public void convert() {
        Meter meter = new Meter(1);
        Centimeter centimeter = new Centimeter(100);
        assertEquals(centimeter,meter.convert(new MeterToCentimeter()));
    }
}