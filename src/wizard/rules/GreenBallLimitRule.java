package wizard.rules;

import wizard.Ball;
import wizard.Colour;
import wizard.ball.Balls;

public class GreenBallLimitRule implements Rule {
    private static final int MAX_LIMIT = 3;

    @Override
    public boolean canBeAdded(Ball ball, Balls balls) {
        return !ball.isOfColour(Colour.GREEN) || balls.numberOfBallsOfColour(Colour.GREEN) < MAX_LIMIT;
    }
}
