package mensuration.units.length;

import mensuration.converter.Converter;
import mensuration.units.Unit;

public class Meter implements Unit {
    private double meter;

    public Meter(double meter) {
        this.meter = meter;
    }

    public Centimeter convertToCentimeter(){
        return new Centimeter(meter*100);
    }

    public Unit convert(Converter converter){
        return converter.convert(meter);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Meter)) return false;

        Meter meter1 = (Meter) o;

        return Double.compare(meter1.meter, meter) == 0;

    }
}
