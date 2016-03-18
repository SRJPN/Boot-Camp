package mensuration.converter;

import mensuration.units.Unit;

public interface Converter {
    Unit convert(double value);
}
