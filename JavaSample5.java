
package com.mycompany.java.sample5;

   class Circle {
    private double radius;
    private String color;

    // Default constructor
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    // Constructor with radius
    public Circle(double radius) {
        this.radius = radius;
        color = "red";
    }

    // Constructor with radius and color
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Calculate the area of the circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}

class Cylinder extends Circle {
    private double height;

    // Default constructor
    public Cylinder() {
        super(); // Call the default Circle constructor
        height = 1.0;
    }

    // Constructor with radius
    public Cylinder(double radius) {
        super(radius); // Call the Circle constructor with radius
        height = 1.0;
    }

    // Constructor with radius, height, and color
    public Cylinder(double radius, double height, String color) {
        super(radius, color); // Call the Circle constructor with radius and color
        this.height = height;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    // Calculate the volume of the cylinder
    public double getVolume() {
        return super.getArea() * height;
    }
}
public class JavaSample5 {

    public static void main(String[] args) {
        Circle circle = new Circle(2.0, "blue");
        System.out.println(circle.toString());
        System.out.println("Area: " + circle.getArea());

        Cylinder cylinder = new Cylinder(2.0, 3.0, "green");
        System.out.println(cylinder.toString());
        System.out.println("Area: " + cylinder.getArea());
        System.out.println("Volume: " + cylinder.getVolume());
    }
}
