package mensuration.converter.lengthConverter;

import mensuration.converter.Converter;
import mensuration.units.length.Meter;

public class FeetToMeter implements Converter {
    @Override
    public Meter convert(double value) {
        return new Meter(value*0.3048);
    }
}
