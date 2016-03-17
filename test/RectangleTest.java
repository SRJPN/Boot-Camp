import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void rectangleCannotBeCreatedUsingNegativeValues() {
        exception.expect(NonPositiveValueException.class);
        exception.expectMessage("Rectangle cannot be created with length -2.0 and width -6.0");
        Rectangle.create(-2, -6);
    }

    @Test
    public void rectangleCannotBeCreatedUsingZeroAsLengthOrWidth() {
        exception.expect(NonPositiveValueException.class);
        exception.expectMessage("Rectangle cannot be created with length 3.0 and width 0.0");
        Rectangle.create(3, 0);
    }

    @Test
    public void areaOfRectangleShouldGiveAreaWhenPositiveValuesAreGivenAsLengthAndWidth() {
        Rectangle rectangle = Rectangle.create(7.5, 5);
        double expected = 37.5;
        assertEquals(expected, rectangle.calculateArea(), 2);
    }

    @Test
    public void perimeterOfRectangleShouldGivePerimeterWhenPositiveValuesAreGivenAsLengthAndWidth() {
        Rectangle rectangle = Rectangle.create(7.5, 5);
        double expected = 25;
        assertEquals(expected, rectangle.calculatePerimeter(), 2);
    }
}