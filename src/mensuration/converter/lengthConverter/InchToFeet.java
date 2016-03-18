package mensuration.converter.lengthConverter;

import mensuration.converter.Converter;
import mensuration.units.length.Feet;
import mensuration.units.Unit;

public class InchToFeet implements Converter {
    @Override
    public Unit convert(double value) {
        return new Feet(value/12);
    }
}
