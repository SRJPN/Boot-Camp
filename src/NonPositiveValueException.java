public class NonPositiveValueException extends RuntimeException {
    public NonPositiveValueException(double length,double width) {
        super("Rectangle cannot be created with length "+length+" and width "+width);
    }
}
