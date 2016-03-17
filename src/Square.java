/*
    job of Square class-
        Calculate all the calculations which includes sides of square
        Comparative checks with another square
 */
public class Square implements Shape {
    private double side;

    public static Square create(double lengthOfSide){
        if(lengthOfSide <= 0)
            throw new NonPositiveValueExceptionForSquare(lengthOfSide);
        return new Square(lengthOfSide);
    }

    private Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side*side;
    }

    @Override
    public double calculatePerimeter() {
        return 4*side;
    }
}
