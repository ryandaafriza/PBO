package MainShape;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Rectangle(){
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        setColor(color);
        setFilled(filled);
    }

    public double getArea(){
        return width * length;
    }

    public double getPerimeter(){
        return (2 * width) + (2 * length);
    }

    @Override
    public String toString() {
        return "Rectangle[Shape[Color=" + getColor() + " Filled=" + isFilled() + "], Width=" + this.width + ", Length=" + this.length;
    }
}
