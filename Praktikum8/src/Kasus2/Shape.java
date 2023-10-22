package Kasus2;

abstract public class Shape {
    String shapeName;

    public Shape(String name){
        shapeName = name;
    }

    public String toString(){
        String result = "Shape Name: " + shapeName;

        return result;
    }

    public abstract double area();
}
