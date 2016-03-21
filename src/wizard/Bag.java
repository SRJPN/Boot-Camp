package wizard;

import java.util.ArrayList;
import java.util.HashMap;

/*
    Job of the class
        - Store balls
 */

public class Bag {
    private static int MAXNUMBEROFBALLS = 12;
    HashMap numberOfBalls = new HashMap<String,Integer>();
    private ArrayList<Ball> balls;

    public Bag() {
        balls = new ArrayList<>(MAXNUMBEROFBALLS);
    }

    public boolean add(Ball other) {
      if(isValidToAdd(other)){
          balls.add(other);
          updateBallInformation(other);
          return true;
      }
        return false;
    }

    private boolean isValidToAdd(Ball another){
        if(another.isSameColour(Ball.GREEN)){
            if(numberOfBalls.get(Ball.GREEN) == null) return true;
            return (int)numberOfBalls.get(Ball.GREEN) < 3;
        }
        else if(another.isSameColour(Ball.RED)){
            int numberOfGreenBalls = numberOfBalls.get(Ball.GREEN) == null?0:(int) numberOfBalls.get(Ball.GREEN);
            int numberOfRedBalls = numberOfBalls.get(Ball.RED) == null? 0: (int)numberOfBalls.get(Ball.RED);
            return numberOfRedBalls<(numberOfGreenBalls*2);
        }
        return balls.size() < MAXNUMBEROFBALLS;
    }

    private void updateBallInformation(Ball another){
        if(numberOfBalls.containsKey(another)){
            int number = (int) numberOfBalls.get(another);
            numberOfBalls.put(another, ++number);
        }
        else{
            numberOfBalls.put(another,1);
        }
    }
}
