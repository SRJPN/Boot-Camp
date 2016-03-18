package mensuration.units.length;

import mensuration.converter.lengthConverter.InchToFeet;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InchTest {

    @Test
    public void convert() {
        Inch inch = new Inch(12);
        Feet feet = new Feet(1);
        assertEquals(feet,inch.convert(new InchToFeet()));
    }
}