package mensuration.units.length;

import mensuration.converter.Converter;
import mensuration.units.Unit;

public class Feet implements Unit {
    private double feet;

    public Feet(double feet) {
        this.feet = feet;
    }

    public Unit convert(Converter converter){
        return converter.convert(feet);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Feet)) return false;

        Feet feet1 = (Feet) o;

        return Double.compare(feet1.feet, feet) == 0;

    }
}
