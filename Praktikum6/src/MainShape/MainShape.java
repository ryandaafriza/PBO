package MainShape;

public class MainShape {
    public static void main(String[] args) {
        // Declare and allocate a new instance of cylinder
        // with default color, radius, and height
        Circle c1 = new Circle();
        System.out.println("Circle:" + "\nColor= " + c1.getColor() +"\tradius=" + c1.getRadius() + "\tbase area=" + c1.getArea() + "\t" + c1.toString());

        // Declare and allocate a new instance of cylinder
        // specifying height, with default color and radius
        Rectangle c2 = new Rectangle(10.0, 5.0);
        System.out.println("\nRectangle:" + "\nColor= " + c2.getColor() + "\tbase area=" + c2.getArea() + "\t" + c2.toString());

        // Declare and allocate a new instance of cylinder
        // specifying radius and height, with default color

        Square c3 = new Square(2.0, "Blue",true );
        System.out.println("\nSquare:" + "\nColor= " + c3.getColor() + "\tperimeter=" + c3.getPerimeter() +"\tbase area=" + c3.getArea() + "\t" + c3.toString());
    }
}
