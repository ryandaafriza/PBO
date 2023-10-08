package MainShape;

public class Circle extends Shape{
        // private instance variable, not accessible from outside this class
        private double radius;
    
        /** Returns the radius */
        public double getRadius() {
            return radius;
        }
    
        public void setRadius(double r) {
            this.radius = r;
        }
    
        // Constructors (overloaded)
        /** Constructs a Circle instance with default value for radius and color */
        public Circle() { // 1st (default) constructor
            radius = 1.0;
        }
    
        public Circle(double r) { // 1st (default) constructor
            this.radius = r;
        }

        public Circle(double r, String c, boolean f) {
            this.radius = r;
            setColor(c); 
            setFilled(f);
        }
    
        /** Returns the area of this Circle instance */
        public double getArea() {
            return radius * radius * Math.PI;
        }

        public double getPerimeter(){
            return 2 * Math.PI * getRadius();
        }
    
        /**
         * Return a self-descriptive string of this instance in the form of
         * Circle[radius=?,color=?]
         */

        @Override
        public String toString() {
            return "Circle[Shape[Color=" + getColor() + " Filled=" + isFilled() + "],Radius=" + this.radius;
        }
}
