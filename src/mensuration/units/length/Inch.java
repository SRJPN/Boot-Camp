package mensuration.units.length;

import mensuration.converter.Converter;
import mensuration.units.Unit;

public class Inch implements Unit {
    private double inch;

    public Inch(double inch) {
        this.inch = inch;
    }

    public Unit convert(Converter converter){
        return converter.convert(inch);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Inch)) return false;

        Inch inch1 = (Inch) o;

        return Double.compare(inch1.inch, inch) == 0;

    }
}
