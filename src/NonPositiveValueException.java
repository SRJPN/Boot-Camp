public class NonPositiveValueException extends Throwable {
    public NonPositiveValueException(double length,double width) {
        super("Rectangle cannot be created with length "+length+" and width "+width);
    }
}
