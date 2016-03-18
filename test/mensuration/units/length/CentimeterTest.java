package mensuration.units.length;

import mensuration.converter.lengthConverter.CentimeterToInch;
import mensuration.converter.lengthConverter.CentimeterToMeter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CentimeterTest {

    @Test
    public void convert() {
        Meter meter = new Meter(1);
        Centimeter centimeter = new Centimeter(100);
        assertEquals(meter,centimeter.convert(new CentimeterToMeter()));
    }

    @Test
    public void conversion_to_inch_gives_in_ratio_5to2() {
        Centimeter centimeter = new Centimeter(5);
        Inch inch = new Inch(2);
        assertEquals(inch,centimeter.convert(new CentimeterToInch()));
    }
}