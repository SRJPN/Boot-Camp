public class NonPositiveValueExceptionForSquare extends RuntimeException {
    public NonPositiveValueExceptionForSquare(double lengthOfSide) {
        super("Square cannot be created with side "+lengthOfSide);
    }
}
