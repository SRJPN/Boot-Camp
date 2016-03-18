package mensuration.converter.lengthConverter;

import mensuration.converter.Converter;
import mensuration.units.Unit;
import mensuration.units.length.Inch;

public class CentimeterToInch implements Converter {
    @Override
    public Unit convert(double value) {
        return new Inch((value*2)/5);
    }
}
