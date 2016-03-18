package mensuration.converter.volumeConverter;

import mensuration.converter.Converter;
import mensuration.units.Unit;
import mensuration.units.volume.Gallon;

public class LiterToGallon implements Converter {
    @Override
    public Unit convert(double value) {
        return new Gallon(value/3.78);
    }
}
