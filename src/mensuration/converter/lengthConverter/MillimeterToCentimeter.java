package mensuration.converter.lengthConverter;

import mensuration.converter.Converter;
import mensuration.units.length.Centimeter;
import mensuration.units.Unit;

public class MillimeterToCentimeter implements Converter {
    @Override
    public Unit convert(double value) {
        return new Centimeter(value/10);
    }
}
