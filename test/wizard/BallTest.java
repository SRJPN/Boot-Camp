package wizard;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class BallTest {

    @Test
    public void can_tell_weather_another_ball_is_of_same_colour_or_not() {
        Ball green = Ball.GREEN;
        Ball blue = Ball.BLUE;
        assertTrue(green.isSameColour(green));
        assertFalse(green.isSameColour(blue));
    }
}