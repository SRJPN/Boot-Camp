package chance;

public class InvalidProbabilityException extends Throwable {
    public InvalidProbabilityException(double value) {
        super("Probability should be between 0 to 1 but got "+value);
    }
}
