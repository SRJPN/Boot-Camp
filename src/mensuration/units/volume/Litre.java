package mensuration.units.volume;

import mensuration.converter.Converter;
import mensuration.units.Unit;

public class Litre implements Unit {
    private double litre;

    public Litre(double litre) {
        this.litre = litre;
    }

    @Override
    public Unit convert(Converter converter) {
        return converter.convert(litre);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Litre)) return false;

        Litre litre1 = (Litre) o;

        return Double.compare(litre1.litre, litre) == 0;

    }
}
