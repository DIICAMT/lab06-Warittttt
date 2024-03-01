package org.dii.oop.lesson06.exercise01;

public class Shape {
    private String name;
    private int numSides;

    public Shape(String name, int numSides) {
        this.name = name;
        this.numSides = numSides;
    }

    public Shape() {

    }

    public String getName() {
        return name;
    }

    public int getNumSides() {
        return numSides;
    }

    public double getArea() {
        return 0.0;
    }

    public double getPerimeter() {
        return 0.0;
    }
}