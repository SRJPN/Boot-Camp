package mensuration.converter.lengthConverter;

import mensuration.converter.Converter;
import mensuration.units.Unit;
import mensuration.units.length.Centimeter;

public class MeterToCentimeter implements Converter {
    @Override
    public Unit convert(double value) {
        return new Centimeter(value*100);
    }
}
