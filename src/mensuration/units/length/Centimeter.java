package mensuration.units.length;

import mensuration.converter.Converter;
import mensuration.units.Unit;

public class Centimeter implements Unit {
    private double centimeter;

    public Centimeter(double centimeter) {
        this.centimeter = centimeter;
    }

    public Unit convert(Converter converter){
        return converter.convert(centimeter);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Centimeter)) return false;

        Centimeter that = (Centimeter) o;

        return Double.compare(that.centimeter, centimeter) == 0;

    }
}
