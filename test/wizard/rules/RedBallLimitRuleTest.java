package wizard.rules;

import org.junit.Test;
import wizard.Ball;
import wizard.Colour;
import wizard.ball.Balls;

import static org.junit.Assert.*;

public class RedBallLimitRuleTest {

    @Test
    public void testCanBeAdded() {
        RedBallLimitRule redBallLimitRule = new RedBallLimitRule();
        Balls balls = new Balls();
        balls.add(new Ball(Colour.GREEN));
        balls.add(new Ball(Colour.GREEN));
        assertTrue(redBallLimitRule.canBeAdded(new Ball(Colour.RED),balls));

        balls.add(new Ball(Colour.RED));
        balls.add(new Ball(Colour.RED));
        balls.add(new Ball(Colour.RED));
        balls.add(new Ball(Colour.RED));

        assertFalse(redBallLimitRule.canBeAdded(new Ball(Colour.RED),balls));
    }
}