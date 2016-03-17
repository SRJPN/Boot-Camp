public class NonPositiveValueException extends RuntimeException {
    public NonPositiveValueException(double length) {
        super("Shape cannot be created with length "+length);
    }
}
