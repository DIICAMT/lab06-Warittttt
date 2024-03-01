package org.dii.oop.lesson06.exercise02;

import org.dii.oop.lesson06.exercise01.Circle;
import org.dii.oop.lesson06.exercise01.Rectangle;
import org.dii.oop.lesson06.exercise01.Shape;

import java.text.MessageFormat;
import java.util.ArrayList;

public class CustomArrayList<T> extends ArrayList<T> {
    public void listAllShapes() {
        for (T shape : this) {
            if (shape instanceof Shape s) {
                System.out.println(MessageFormat.format("Name: {0}, Number of side: {1}, Area: {2}, Perimeter: {3}",
                        s.getName(), s.getNumSides(), s.getArea(), s.getPerimeter()));
            }
        }
    }

    public double sumArea() {
        double totalArea = 0.0;
        for (T shape : this) {
            if (shape instanceof Shape s) {
                totalArea += s.getArea();
            }
        }
        return totalArea;
    }

    public void add(Rectangle rectangle) {

    }

    public void add(Circle circle) {

    }
}

