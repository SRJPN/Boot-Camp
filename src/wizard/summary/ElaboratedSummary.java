package wizard.summary;

import javafx.util.Pair;
import wizard.Colour;
import wizard.ball.Ball;
import wizard.ball.Balls;

import java.util.AbstractList;
import java.util.ArrayList;

public class ElaboratedSummary implements Summary {
    private ArrayList<Pair<Colour,Integer>> balls;
    private int totalNumberOfBalls = 0;

    public ElaboratedSummary() {
        this.balls = new ArrayList<>();
    }

    @Override
    public String represent() {
        return null;
    }

    @Override
    public ElaboratedSummary summerize(Balls other) {
        Colour[] colours = {Colour.YELLOW,Colour.GREEN,Colour.RED,Colour.BLUE};
        totalNumberOfBalls = other.size();
        Colour tempColour = Colour.YELLOW;
        int tempCount = 0;
        for (Ball ball : other) {
            for (Colour colour : colours) {
                if(!ball.isOfColour(tempColour)){

                }
            }
        }
        return this;
    }
}
