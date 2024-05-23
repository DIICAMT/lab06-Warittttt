package org.dii.oop.lesson06.exercise02;

import java.util.Scanner;

public class Lesson {
    private static ShapeList shapes = new ShapeList();
    private static Scanner scanner = new Scanner(System.in);

    public static void run() {
        while (true) {
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Display all shapes");
            System.out.println("5. Show summation of area");
            System.out.println("6. Exit");
            System.out.print("Please select [1-6]: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addCircle();
                    break;
                case 2:
                    addRectangle();
                    break;
                case 3:
                    addSquare();
                    break;
                case 4:
                    shapes.listAllShapes();
                    break;
                case 5:
                    System.out.printf("Summation of area is %.2f%n", shapes.sumArea());
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }
    }

    private static void addCircle() {
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        shapes.add(new Circle(radius));
    }

    private static void addRectangle() {
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        shapes.add(new Rectangle(width, height));
    }

    private static void addSquare() {
        System.out.print("Enter side: ");
        double side = scanner.nextDouble();
        shapes.add(new Square(side));
    }
}
