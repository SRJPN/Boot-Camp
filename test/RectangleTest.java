import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RectangleTest {

    @Test
    public void rectangleCannotBeCreatedUsingNegativeValues() throws Exception {
        try {
            Rectangle.create(-2, -6);
            assertTrue(false);
        } catch (Exception e) {
            assertEquals("Rectangle cannot be created with length -2.0 and width -6.0", e.getMessage());
        }
    }

    @Test
    public void rectangleCannotBeCreatedUsingZeroAsLengthOrWidth() throws Exception {
        try {
            Rectangle.create(3, 0);
            assertTrue(false);
        } catch (Exception e) {
            assertEquals("Rectangle cannot be created with length 3.0 and width 0.0", e.getMessage());
        }
    }

    @Test
    public void areaOfRectangleShouldGiveAreaWhenPositiveValuesAreGivenAsLengthAndWidth() throws Exception {
        Rectangle rectangle = Rectangle.create(7.5, 5);
        double expected = 37.5;
        assertEquals(expected, rectangle.calculateArea(), 2);
    }

    @Test
    public void perimeterOfRectangleShouldGivePerimeterWhenPositiveValuesAreGivenAsLengthAndWidth() throws Exception {
        Rectangle rectangle = Rectangle.create(7.5, 5);
        double expected = 25;
        assertEquals(expected, rectangle.calculatePerimeter(), 2);
    }
}