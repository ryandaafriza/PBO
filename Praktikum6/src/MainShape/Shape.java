package MainShape;

public class Shape {
    private String color = "red";
    private boolean filled = true;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getFilled() {
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public Shape(){
        color = "Green";
        filled = true;
    }

    public Shape(String c, boolean b){
        this.color = c;
        this.filled = b;
    }

    public boolean isFilled(){
        if(filled == true){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString() {
        return "Shape[Color=" + color + " Filled=" + filled + "]";
    }
}
