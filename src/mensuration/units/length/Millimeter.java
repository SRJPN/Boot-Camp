package mensuration.units.length;

import mensuration.converter.Converter;
import mensuration.units.Unit;

public class Millimeter {
    private double millimeter;

    public Millimeter(double millimeter) {
        this.millimeter = millimeter;
    }

    public Unit convert(Converter converter){
        return converter.convert(millimeter);
    }
}
