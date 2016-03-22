package wizard;

import org.junit.Before;
import org.junit.Test;
import wizard.rules.GreenBallLimitRule;
import wizard.rules.RedBallLimitRule;
import wizard.rules.Rules;
import wizard.rules.YellowBallLimitRule;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class BagTest {

    private Bag bag;

    @Before
    public void setUp() throws Exception {
        Rules rules = new Rules();
        rules.add(new GreenBallLimitRule());
        rules.add(new YellowBallLimitRule());
        rules.add(new RedBallLimitRule());
        this.bag = new Bag(12, rules);
    }

    @Test
    public void balls_can_be_added_to_the_bag() {
        Ball ball = new Ball(Colour.GREEN);
        assertTrue(bag.add(ball));
    }

    @Test
    public void bag_can_hold_maximum_12_balls() {
        Ball greenBall = new Ball(Colour.GREEN);
        Ball blueBall = new Ball(Colour.BLUE);
        Ball redBall = new Ball(Colour.RED);
        assertTrue(bag.add(greenBall));
        assertTrue(bag.add(greenBall));
        assertTrue(bag.add(greenBall));

        assertTrue(bag.add(blueBall));
        assertTrue(bag.add(blueBall));
        assertTrue(bag.add(blueBall));

        assertTrue(bag.add(redBall));
        assertTrue(bag.add(redBall));
        assertTrue(bag.add(redBall));

        assertTrue(bag.add(blueBall));
        assertTrue(bag.add(blueBall));
        assertTrue(bag.add(blueBall));

        assertFalse(bag.add(blueBall));
    }

    @Test
    public void bag_can_not_hold_more_than_3_balls_of_any_colour() {
        Ball greenBall = new Ball(Colour.GREEN);

        assertTrue(bag.add(greenBall));
        assertTrue(bag.add(greenBall));
        assertTrue(bag.add(greenBall));

        assertFalse(bag.add(greenBall));
    }

    @Test
    public void bag_cannot_add_red_balls_without_any_green_balls() {
        Ball redBall = new Ball(Colour.RED);

        assertFalse(bag.add(redBall));
    }

    @Test
    public void bag_cannot_add_red_balls_more_than_double_the_number_of_green_balls() {
        Ball greenBall = new Ball(Colour.GREEN);
        Ball redBall = new Ball(Colour.RED);
        assertTrue(bag.add(greenBall));
        assertTrue(bag.add(redBall));
        assertTrue(bag.add(redBall));
        assertFalse(bag.add(redBall));
    }

    @Test
    public void bag_cannot_add_yellow_balls_more_than_40_percent_the_number_of_total_balls_in_bag() {
        Ball greenBall = new Ball(Colour.GREEN);
        Ball redBall = new Ball(Colour.RED);
        assertTrue(bag.add(greenBall));
        assertTrue(bag.add(redBall));
        assertTrue(bag.add(redBall));
        assertTrue(bag.add(new Ball(Colour.YELLOW)));
        assertTrue(bag.add(new Ball(Colour.YELLOW)));
        assertFalse(bag.add(new Ball(Colour.YELLOW)));
    }
}