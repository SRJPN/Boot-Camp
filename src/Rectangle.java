/*
    job of Rectangle class-
        Calculate all the calculations which includes length and/or width of the Rectangle
        Comparative checks with another Rectangle
 */
public class Rectangle implements Shape {
    private double length, width;

    public static Rectangle create(double length, double width) throws NonPositiveValueException {
        if (length <= 0 || width <= 0)
            throw new NonPositiveValueException(length,width);
        return new Rectangle(length, width);
    }

    private Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
