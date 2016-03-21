package wizard;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class BagTest {

    @Test
    public void balls_can_be_added_to_the_bag() {
        Bag bag = new Bag();
        Ball ball = new Ball("Green");
        assertTrue(bag.add(ball));
    }

    @Test
    public void bag_can_hold_maximum_12_balls() {
        Bag bag = new Bag();
        Ball greenBall = new Ball("Green");
        Ball blueBall = new Ball("Blue");
        Ball redBall = new Ball("Red");
        Ball yellowBall = new Ball("Yellow");
        Ball purpleBall = new Ball("Purple");
        assertTrue(bag.add(greenBall));
        assertTrue(bag.add(greenBall));
        assertTrue(bag.add(greenBall));

        assertTrue(bag.add(blueBall));
        assertTrue(bag.add(blueBall));
        assertTrue(bag.add(blueBall));

        assertTrue(bag.add(redBall));
        assertTrue(bag.add(redBall));
        assertTrue(bag.add(redBall));

        assertTrue(bag.add(yellowBall));
        assertTrue(bag.add(yellowBall));
        assertTrue(bag.add(yellowBall));

        assertFalse(bag.add(purpleBall));
    }

    @Test
    public void bag_can_not_hold_more_than_3_balls_of_any_colour() {
        Bag bag = new Bag();
        Ball greenBall = new Ball("Green");

        assertTrue(bag.add(greenBall));
        assertTrue(bag.add(greenBall));
        assertTrue(bag.add(greenBall));

        assertFalse(bag.add(greenBall));
    }
}