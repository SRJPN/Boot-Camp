package mensuration.converter.volumeConverter;

import mensuration.converter.Converter;
import mensuration.units.Unit;
import mensuration.units.volume.Litre;

public class GallonToLitre implements Converter {
    @Override
    public Unit convert(double value) {
        return new Litre(value*3.78);
    }
}
