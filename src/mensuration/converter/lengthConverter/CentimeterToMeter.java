package mensuration.converter.lengthConverter;

import mensuration.converter.Converter;
import mensuration.units.Unit;
import mensuration.units.length.Meter;

public class CentimeterToMeter implements Converter {
    @Override
    public Unit convert(double value) {
        return new Meter(value/100);
    }
}
