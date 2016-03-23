package wizard.rules;

import wizard.ball.Ball;
import wizard.Colour;
import wizard.ball.Balls;

public class RedBallLimitRule implements Rule {

    @Override
    public boolean canBeAdded(Ball ball, Balls balls) {
        return !ball.isOfColour(Colour.RED)
                || (balls.numberOfBallsOfColour(Colour.GREEN) * 2) > balls.numberOfBallsOfColour(Colour.RED);
    }
}
