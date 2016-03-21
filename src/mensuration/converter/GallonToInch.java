package mensuration.converter;

import mensuration.units.Unit;
import mensuration.units.length.Inch;

public class GallonToInch implements Converter {
    @Override
    public Unit convert(double value) {
        return new Inch(value);
    }
}
