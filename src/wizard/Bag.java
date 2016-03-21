package wizard;

import java.util.ArrayList;

/*
    Job of the class
        - Store balls
 */

public class Bag {
    private static int MAXNUMBEROFBALLS = 12;
    private ArrayList balls = new ArrayList(MAXNUMBEROFBALLS);

    public Bag() {
    }

    public boolean add(Object ball) {
        return balls.size() < MAXNUMBEROFBALLS && balls.add(ball);
    }
}
