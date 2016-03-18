package mensuration.units.volume;

import mensuration.converter.volumeConverter.GallonToLitre;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GallonTest {

    @Test
    public void convert() {
        Litre litre = new Litre(3.78);
        Gallon gallon = new Gallon(1);
        assertEquals(litre,gallon.convert(new GallonToLitre()));
    }
}