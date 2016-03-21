package wizard;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class BagTest {

    @Test
    public void balls_can_be_added_to_the_bag() {
        Bag bag = new Bag();
        Ball ball = Ball.GREEN;
        assertTrue(bag.add(ball));
    }

    @Test
    public void bag_can_hold_maximum_12_balls() {
        Bag bag = new Bag();
        Ball greenBall = Ball.GREEN;
        Ball blueBall = Ball.BLUE;
        Ball redBall = Ball.RED;
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
        Bag bag = new Bag();
        Ball greenBall = Ball.GREEN;

        assertTrue(bag.add(greenBall));
        assertTrue(bag.add(greenBall));
        assertTrue(bag.add(greenBall));

        assertFalse(bag.add(greenBall));
    }

    @Test
    public void bag_cannot_add_red_balls_without_any_green_balls() {
        Bag bag = new Bag();
        Ball redBall = Ball.RED;

        assertFalse(bag.add(redBall));
    }

    @Test
    public void bag_cannot_add_red_balls_more_than_double_the_number_of_green_balls() {
        Bag bag = new Bag();
        Ball greenBall = Ball.GREEN;
        Ball redBall = Ball.RED;
        assertTrue(bag.add(greenBall));
        assertTrue(bag.add(redBall));
        assertTrue(bag.add(redBall));
        assertFalse(bag.add(redBall));
    }
}