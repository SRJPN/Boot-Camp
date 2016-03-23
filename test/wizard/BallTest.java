package wizard;

import org.junit.Test;
import wizard.ball.Ball;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class BallTest {

    @Test
    public void can_tell_weather_another_ball_is_of_same_colour_or_not() {
        Ball green = new Ball(Colour.GREEN);
        assertTrue(green.isOfColour(Colour.GREEN));
        assertFalse(green.isOfColour(Colour.BLUE));
    }
}