package wizard.summary;

import org.junit.Test;
import wizard.Colour;
import wizard.ball.Ball;
import wizard.ball.Balls;

import static org.junit.Assert.*;

public class SimpleSummeryTest {

    @Test
    public void testRepresent() {
        Balls balls = new Balls();
        balls.add(new Ball(Colour.RED));
        balls.add(new Ball(Colour.GREEN));
        balls.add(new Ball(Colour.BLUE));
        balls.add(new Ball(Colour.YELLOW));

        Summary summary = new SimpleSummery().summerize(balls);

        String expected = "Bag : 4 Balls\n" +
                          "YELLOW : 1\n" +
                          "GREEN : 1\n" +
                          "RED : 1\n" +
                          "BLUE : 1\n";

        assertEquals(expected,summary.represent());
    }
}