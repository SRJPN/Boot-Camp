package wizard;

import java.util.ArrayList;

/*
    Job of the class
        - Store balls
 */

public class Bag {
    private static int MAXNUMBEROFBALLS = 12;
    private ArrayList<Ball> balls;

    public Bag() {
        balls = new ArrayList<>(MAXNUMBEROFBALLS);
    }

    public boolean add(Ball other) {
        int count = 0;
        for (Ball ball : balls){
            if(ball.isSameColour(other))
                count++;
        }
        if(count>2) return false;
        return balls.size() < MAXNUMBEROFBALLS && balls.add(other);
    }
}
