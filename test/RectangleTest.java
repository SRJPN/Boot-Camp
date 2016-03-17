import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void rectangleCannotBeCreatedUsingNegativeValues() throws NonPositiveValueException {
        exception.expect(NonPositiveValueException.class);
        exception.expectMessage("Expected positive values,but got -2.0");
        Rectangle.create(-2, -6);
    }

    @Test
    public void rectangleCannotBeCreatedUsingZeroAsLengthOrWidth() throws NonPositiveValueException {
        exception.expect(NonPositiveValueException.class);
        exception.expectMessage("Expected positive values,but got 0.0");
        Rectangle.create(3, 0);
    }

    @Test
    public void areaOfRectangleShouldGiveAreaWhenPositiveValuesAreGivenAsLengthAndWidth() throws NonPositiveValueException {
        Rectangle rectangle = Rectangle.create(7.5, 5);
        double expected = 37.5;
        assertEquals(expected, rectangle.calculateArea(), 2);
    }

    @Test
    public void perimeterOfRectangleShouldGivePerimeterWhenPositiveValuesAreGivenAsLengthAndWidth() throws NonPositiveValueException {
        Rectangle rectangle = Rectangle.create(7.5, 5);
        double expected = 25;
        assertEquals(expected, rectangle.calculatePerimeter(), 2);
    }
}