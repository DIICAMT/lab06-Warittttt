package org.dii.oop.lesson06.exercise01;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle( double width, double height) {
        super("Rectangle", 4);
        this.width = width;
        this.height = height;
    }


    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

