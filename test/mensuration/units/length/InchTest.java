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

    @Test
    public void can_be_added_with_another_inch() {
        Inch inch = new Inch(2);
        Inch inch1 = new Inch(2);
        Inch expected = new Inch(4);
        assertEquals(expected,inch.add(inch1));
    }
}