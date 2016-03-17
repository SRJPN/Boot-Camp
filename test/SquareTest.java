import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class SquareTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void squareCannotBeCreatedUsingNegativeValues() {
        exception.expect(NonPositiveValueExceptionForSquare.class);
        exception.expectMessage("Square cannot be created with side -2.0");
        Square.create(-2);
    }

    @Test
    public void squareCannotBeCreatedUsingZeroAsLengthOrWidth() {
        exception.expect(NonPositiveValueExceptionForSquare.class);
        exception.expectMessage("Square cannot be created with side 0.0");
        Square.create(0);
    }

    @Test
    public void areaOfSquareShouldGiveAreaWhenPositiveValuesAreGivenAsLengthAndWidth() {
        Square square = Square.create(5);
        double expected = 25;
        assertEquals(expected, square.calculateArea(), 2);
    }

    @Test
    public void perimeterOfSquareShouldGivePerimeterWhenPositiveValuesAreGivenAsLengthAndWidth() {
        Square square = Square.create(5);
        double expected = 20;
        assertEquals(expected, square.calculatePerimeter(), 2);
    }
}