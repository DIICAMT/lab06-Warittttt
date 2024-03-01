package org.dii.oop.lesson06.exercise02;

import org.dii.oop.lesson06.exercise01.Circle;
import org.dii.oop.lesson06.exercise01.Rectangle;
import org.dii.oop.lesson06.exercise01.Square;

import java.util.Scanner;
import java.util.ArrayList; //this exercise MUST use extended version of arrayList

public class Lesson {
    public static void run() {

        CustomArrayList<Shape> shapes = new CustomArrayList<>();

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("\n1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Display all shapes");
            System.out.println("5. Show summation of area");
            System.out.println("6. Exit");
            System.out.print("Please select [1-6]: ");

            String choice = in.nextLine().trim();
            //interesting ops


            if ("1".equals(choice)) {
                System.out.print("Enter radius: ");
                double radius = Double.parseDouble(in.nextLine());
                shapes.add(new Circle(radius));
            } else if ("2".equals(choice)) {
                System.out.print("Enter width: ");
                double width = Double.parseDouble(in.nextLine());
                System.out.print("Enter height: ");
                double height = Double.parseDouble(in.nextLine());
                shapes.add(new Rectangle(width, height));
            } else if ("3".equals(choice)) {
                System.out.print("Enter side: ");
                double side = Double.parseDouble(in.nextLine());
                shapes.add(new Square(side));
            } else if ("4".equals(choice)) {
                System.out.println("List all shape:");
                for (Shape shape : shapes) {
                    System.out.println("Name: " + shape.getName() +
                            ", Number of side: " + shape.getNumSides() +
                            ", Area: " + shape.getArea() +
                            ", Perimeter: " + shape.getPerimeter());
                }
            } else if ("5".equals(choice)) {
                System.out.println("Summation of area is " + shapes.sumArea());
            } else if ("6".equals(choice)) {
                break;
            }
           
        } while(true);

        in.close();
    }
}