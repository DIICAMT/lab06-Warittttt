package org.dii.oop.lesson06.exercise01;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public String getName() {
        return "Square";
    }
}


