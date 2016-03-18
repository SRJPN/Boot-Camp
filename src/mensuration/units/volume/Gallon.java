package mensuration.units.volume;

import mensuration.converter.Converter;
import mensuration.units.Unit;

public class Gallon implements Unit{

    private double gallon;

    public Gallon(double gallon) {
        this.gallon = gallon;
    }

    @Override
    public Unit convert(Converter converter) {
        return converter.convert(gallon);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gallon)) return false;

        Gallon gallon1 = (Gallon) o;

        return Double.compare(gallon1.gallon, gallon) == 0;

    }
}
