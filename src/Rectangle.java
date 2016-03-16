/*
    job of Rectangle class-
        Calculate all the calculations which includes length and/or width of the Rectangle
        Comparative checks with another Rectangle
 */
public class Rectangle {
    private double length,width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea(){
        return length*width;
    }

    public double calculatePerimeter(){
        return  2*(length + width);
    }
}
