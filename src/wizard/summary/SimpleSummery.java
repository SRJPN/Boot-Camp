package wizard.summary;

import javafx.util.Pair;
import wizard.Colour;
import wizard.ball.Balls;

import java.util.ArrayList;

public class SimpleSummery implements Summary {

    private ArrayList<Pair<Colour,Integer>> balls;
    private int totalNumberOfBalls = 0;

    public SimpleSummery() {
        this.balls = new ArrayList<>();
    }

    @Override
    public String represent() {
        String result = "Bag : "+totalNumberOfBalls+" Balls\n";
        for (Pair pair : balls) {
            result += pair.getKey()+" : "+pair.getValue()+"\n";
        }
        return result;
    }

    @Override
    public SimpleSummery summerize(Balls others) {
        Colour[] colours = {Colour.YELLOW,Colour.GREEN,Colour.RED,Colour.BLUE};
        totalNumberOfBalls = others.size();
        for (Colour colour : colours) {
            int numberOfBalls = others.numberOfBallsOfColour(colour);
            this.balls.add(new Pair<Colour, Integer>(colour,numberOfBalls));
        }
        return this;
    }
}
