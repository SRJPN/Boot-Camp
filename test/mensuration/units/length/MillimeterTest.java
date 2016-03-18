package mensuration.units.length;

import mensuration.converter.lengthConverter.MillimeterToCentimeter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MillimeterTest {

    @Test
    public void convert() {
        Millimeter millimeter = new Millimeter(10);
        Centimeter centimeter = new Centimeter(1);
        assertEquals(centimeter,millimeter.convert(new MillimeterToCentimeter()));
    }
}