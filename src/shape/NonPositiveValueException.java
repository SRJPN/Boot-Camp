package shape;

public class NonPositiveValueException extends Exception {
    public NonPositiveValueException(double length) {
        super("Expected positive values,but got "+length);
    }
}
