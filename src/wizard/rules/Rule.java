package wizard.rules;

import wizard.Ball;
import wizard.ball.Balls;

public interface Rule {
    boolean canBeAdded(Ball ball, Balls balls);
}
