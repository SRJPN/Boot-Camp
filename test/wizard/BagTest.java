package wizard;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class BagTest {

    @Test
    public void balls_can_be_added_to_the_bag() {
        Bag bag = new Bag();
        Ball ball = new Ball();
        assertTrue(bag.add(ball));
    }

    @Test
    public void bag_can_hold_maximum_12_balls() {
        Bag bag = new Bag();
        Ball ball = new Ball();
        assertTrue(bag.add(ball));
        assertTrue(bag.add(ball));
        assertTrue(bag.add(ball));
        assertTrue(bag.add(ball));
        assertTrue(bag.add(ball));
        assertTrue(bag.add(ball));
        assertTrue(bag.add(ball));
        assertTrue(bag.add(ball));
        assertTrue(bag.add(ball));
        assertTrue(bag.add(ball));
        assertTrue(bag.add(ball));
        assertTrue(bag.add(ball));
        assertFalse(bag.add(ball));
    }
}