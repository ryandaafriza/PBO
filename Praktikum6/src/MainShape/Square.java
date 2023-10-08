package MainShape;

public class Square extends Rectangle{
    public Square(){
        super();
    }

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    @Override
    public void setWidth(double side){
        super.setWidth(side);
    }

    @Override
    public void setLength(double side){
        super.setLength(side);
    }

    public void setSide(double side){
        getWidth();
    }

    public double getSide(){
        return getWidth();
    }

    @Override
    public String toString() { // in Cylinder class
        return "Cylinder: subclass of " + super.toString(); // use Circle's toString()+ " height=" + height;
    }
}
