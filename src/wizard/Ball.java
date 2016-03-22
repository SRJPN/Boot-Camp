package wizard;

/*
    Job Of the Class
        - should be able to compare with another ball colour
 */

public class Ball {
    private final Colour colour;

    public Ball(Colour colour) {
        this.colour = colour;
    }

    public boolean isOfColour(Colour other) {
        return this.colour.equals(other);
    }

}