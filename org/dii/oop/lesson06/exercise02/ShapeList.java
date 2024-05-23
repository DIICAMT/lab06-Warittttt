package org.dii.oop.lesson06.exercise02;

import java.util.ArrayList;

public class ShapeList extends ArrayList<Shape> {
    public void listAllShapes() {
        System.out.println("List of all shapes:");
        for (Shape shape : this) {
            System.out.printf("Name: %s, Number of sides: %d, Area: %.2f, Perimeter: %.2f%n",
                    shape.getName(), shape.getNumSide(), shape.getArea(), shape.getPerimeter());
        }
    }

    public double sumArea() {
        double totalArea = 0;
        for (Shape shape : this) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}

