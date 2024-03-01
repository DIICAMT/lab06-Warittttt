package org.dii.oop.lesson06.exercise01;

public class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name, 0); // Circles have 0 sides
        this.radius = radius;
    }

    public Circle(double radius) {
        super("Circle",0);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

