package wizard;

import wizard.ball.Ball;
import wizard.ball.Balls;
import wizard.rules.Rule;
import wizard.rules.Rules;
import wizard.summary.Summary;

/*
    Job of the class
        - Store balls
 */

public class Bag {
    private final int maxBallLimit;
    private final Rules rules;
    private final Balls balls;


    public Bag(int maxBallLimit, Rules rules) {
        this.maxBallLimit = maxBallLimit;
        this.rules = rules;
        this.balls = new Balls();
    }

    public boolean add(Ball ball) {
        if(isFull())
            return false;
        for (Rule rule : rules) {
            if(!rule.canBeAdded(ball, balls))
                return false;
        }
        return balls.add(ball);
    }

    public boolean isFull(){
        return balls.size()==maxBallLimit;
    }

    public Summary summerize(Summary summary){
        return  summary.summerize(balls);
    }
}
