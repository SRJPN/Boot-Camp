package mensuration.units.volume;

import mensuration.converter.volumeConverter.LiterToGallon;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LitreTest {

    @Test
    public void convert() {
        Litre litre = new Litre(3.78);
        Gallon gallon = new Gallon(1);
        assertEquals(gallon,litre.convert(new LiterToGallon()));
    }
}