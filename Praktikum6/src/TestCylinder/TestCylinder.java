/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestCylinder;

/**
 *
 * @author brwnnn
 */



public class TestCylinder {
    public static void main(String[] args) {
        // Declare and allocate a new instance of cylinder
        // with default color, radius, and height
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder:" + "\nColor= " + c1.getColor() +"\tradius=" + c1.getRadius() + "\theight=" + c1.getHeight() + "\tbase area=" + c1.getArea() + "\tvolume=" + c1.getVolume() + "\t" + c1.toString());

        // Declare and allocate a new instance of cylinder
        // specifying height, with default color and radius
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("\nCylinder:" + "\nColor= " + c2.getColor() +"\tradius=" + c2.getRadius() + "\theight=" + c2.getHeight() + "\tbase area=" + c2.getArea() + "\tvolume=" + c2.getVolume() + "\t" + c2.toString());

        // Declare and allocate a new instance of cylinder
        // specifying radius and height, with default color

        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println("\nCylinder:" + "\nColor= " + c3.getColor() +"\tradius=" + c3.getRadius() + "\theight=" + c3.getHeight() + "\tbase area=" + c3.getArea() + "\tvolume=" + c3.getVolume() + "\t" + c3.toString());

        Cylinder c4 = new Cylinder(2.0, 10.0, "Green");
        System.out.println("\nCylinder:" + "\nColor= " + c4.getColor() +"\tradius=" + c4.getRadius() + "\theight=" + c4.getHeight() + "\tbase area=" + c4.getArea() + "\tvolume=" + c4.getVolume() + "\t" + c4.toString());
    }
}
