import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

    @Test
    public void test_calculateArea_gives_the_area_of_the_rectangle_created() throws Exception {
        Rectangle rectangle = new Rectangle(12, 6);
        double expected = 72;
        Assert.assertEquals(expected,rectangle.calculateArea(),2);
    }

    @Test
    public void test_calculateArea_gives_the_area_of_the_rectangle_created_with_decimal_values_as_sides() throws Exception {
        Rectangle rectangle = new Rectangle(7.5, 5);
        double expected = 37.5;
        Assert.assertEquals(expected,rectangle.calculateArea(),2);
    }

    @Test
    public void test_calculatePerimeter_gives_the_perimeter_of_the_rectangle_created() throws Exception {
        Rectangle rectangle = new Rectangle(12, 6);
        double expected = 36;
        Assert.assertEquals(expected,rectangle.calculatePerimeter(),2);
    }

    @Test
    public void test_calculatePerimeter_gives_the_perimeter_of_the_rectangle_created_with_decimal_values_as_sides() throws Exception {
        Rectangle rectangle = new Rectangle(7.5, 5);
        double expected = 25;
        Assert.assertEquals(expected,rectangle.calculatePerimeter(),2);
    }
}