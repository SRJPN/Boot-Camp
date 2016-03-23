package wizard.rules;

import wizard.ball.Ball;
import wizard.Colour;
import wizard.ball.Balls;

public class YellowBallLimitRule implements Rule {

    @Override
    public boolean canBeAdded(Ball ball, Balls balls) {
        return !ball.isOfColour(Colour.YELLOW)
                || (balls.numberOfBallsOfColour(Colour.YELLOW)*100)/balls.size() < 40;
    }
}
