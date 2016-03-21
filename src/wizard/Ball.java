package wizard;

/*
    Job Of the Class
        - should be able to compare with another ball colour
 */

public enum Ball {
    GREEN("GREEN"),
    BLUE("BLUE"),
    RED("RED");
    private final String colour;

    Ball(String colour) {
        this.colour = colour.toUpperCase();
    }

    public boolean isSameColour(Ball other){
        return this.colour.equals(other.colour);
    }

    public String getColour() {
        return colour;
    }
}
