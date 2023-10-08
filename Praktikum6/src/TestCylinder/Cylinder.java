/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestCylinder;

/**
 *
 * @author brwnnn
 */

public class Cylinder extends Circle { // Save as "Cylinder.java"
    private double height; // private variable

    // Constructor with default color, radius and height
    public Cylinder() {

        super(); // call superclass no-arg constructor Circle()
        height = 1.0;
    }

    // Constructor with default radius, color but given height
    public Cylinder(double height) {
        super(); // call superclass no-arg constructor Circle()
        this.height = height;
    }

    // Constructor with default color, but given radius, height
    public Cylinder(double radius, double height) {
        super(radius); // call superclass constructor Circle(r)
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius,color); // call superclass constructor Circle(r)
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((super.getArea() * 2) + (getRadius() * Math.PI * 2 * this.height));
    }

    // A public method for retrieving the height
    public double getHeight() {
        return height;
    }

    public void setHeight(double h){
        this.height = h;
    }

    // A public method for computing the volume of cylinder
    // use superclass method getArea() to get the base area
    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() { // in Cylinder class
        return "Cylinder: subclass of " + super.toString(); // use Circle's toString()+ " height=" + height;
    }
}

