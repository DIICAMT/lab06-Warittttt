package org.dii.oop.lesson06.exercise01;

import java.util.Scanner;
import java.util.ArrayList; //this exercise MUST use arrayList

public class Lesson {
    private static double side;

    public static void run() {
        ArrayList<Shape> shapes = new ArrayList<>();

        //HINT1: usage arraylist with Shape class to store all of your shapes, check how to use arrayList by yourself

        //HINT2: you may want to declare your arrayList around here

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Display all shapes");
            System.out.println("5. Exit");
            System.out.print("Please select [1-5]: ");
            //print menu as instructed in MD file

            String choice = scanner.nextLine().trim();

            // TODO: write your code here

            if ("1".equals(choice)) {
                System.out.print("Enter radius: ");
                double radius = Double.parseDouble(scanner.nextLine());
                shapes.add(new Circle(radius));
                
                //store to arrayList
            }
            else if ("2".equals(choice)) {
                System.out.print("Enter width: ");
                double Width = Double.parseDouble(scanner.nextLine());
                System.out.print("Enter height: ");
                double Height = Double.parseDouble(scanner.nextLine());
                
                //store to arrayList
            }
            else if ("3".equals(choice)) {
                System.out.print("Enter side: ");
                double Side = Double.parseDouble(scanner.nextLine());

                shapes.add(new Square(side));
                //store to arrayList
            }
            else if ("4".equals(choice)) {
                System.out.print("List all shape: ");
                for (Shape shape : shapes) {
                    System.out.println("Name: " + shape.getName() +
                            ", Number of side: " + shape.getNumSides() +
                            ", Area: " + shape.getArea() +
                            ", Perimeter: " + shape.getPerimeter());
                }
                
                //print data as instructed
                //check how to iterate through arrayList

                //HINT3: you can use getClass() function of arrayList to get the name of class. It might be useful : )
            }
            if ("5".equals(choice)) {
                System.out.println("Exiting the program. Goodbye!");
                 break;
            }
           
        } while(true);

        scanner.close();
    }
}