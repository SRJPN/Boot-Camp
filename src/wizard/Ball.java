package wizard;

public class Ball {
    private final String colour;

    public Ball(String colour) {
        this.colour = colour;
    }

    public boolean isSameColour(Ball other){
        return this.colour.equals(other.colour);
    }
}
