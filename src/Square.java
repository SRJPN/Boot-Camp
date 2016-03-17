/*
    job of Square class-
        Calculate all the calculations which includes sides of square
        Comparative checks with another square
 */

public class Square extends Rectangle {
    public static Square create(double lengthOfSide){
        if(lengthOfSide <= 0)
            throw new NonPositiveValueExceptionForSquare(lengthOfSide);
        return new Square(lengthOfSide);
    }

    private Square(double side) {
        super(side,side);
    }
}
