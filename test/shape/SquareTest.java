package shape;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SquareTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void squareCannotBeCreatedUsingNegativeValues() throws NonPositiveValueException {
        exception.expect(NonPositiveValueException.class);
        exception.expectMessage("Expected positive values,but got -2.0");
        Square.create(-2);
    }

    @Test
    public void squareCannotBeCreatedUsingZeroAsLengthOrWidth() throws NonPositiveValueException {
        exception.expect(NonPositiveValueException.class);
        exception.expectMessage("Expected positive values,but got 0.0");
        Square.create(0);
    }
}