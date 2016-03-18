package mensuration.units;

import mensuration.converter.Converter;

public interface Unit {
    Unit convert(Converter converter);
}
