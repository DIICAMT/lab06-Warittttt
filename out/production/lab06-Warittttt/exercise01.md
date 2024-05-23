## [Lesson06](index.md) > Exercise01:

1. Open class [App](app/src/main/java/org/dii/oop/lesson06/exercise01/App.java) in package `org.dii.oop.App` and edit the code as display below: 
   ```
   package org.dii.oop;

   import org.dii.oop.lesson06.org.dii.oop.lesson06.org.dii.oop.lesson06.exercise01.Lesson;
   public class App {
     public static void main(String[] args) {
       lesson.run();
    }
   }
   ```

2. Edit class [Lesson](app/src/main/java/org/dii/oop/lesson06/exercise01/Lesson.java) in package `org.dii.oop.lesson06.org.dii.oop.lesson06.org.dii.oop.lesson06.exercise01` and follow the instructions below:
   - Create a new `super` class name [`Shape`](app/src/main/java/org/dii/oop/lesson06/exercise01/Shape.java) and define the `name` attribute to store the name of the shape, and the `numSide` attribute to store a number of shape sides, the access modifier of these two attributes is `private`.
   - Define the methods of the class `Shape`: `public double getArea()` and `public double getPerimeter()` to return the area and perimeter of its own shape.
   - Create class [`Circle`](app/src/main/java/org/dii/oop/lesson06/exercise01/Circle.java) and make it inherit from the [`Shape`](app/src/main/java/org/dii/oop/lesson06/exercise01/Shape.java) class with its constructor having a parameter for its radius.
   - Create class [`Rectangle`](app/src/main/java/org/dii/oop/lesson06/exercise01/Rectangle.java) and make it inherit from the [`Shape`](app/src/main/java/org/dii/oop/lesson06/exercise01/Shape.java) class with its constructor having a parameters for its side (width and high).
   - Create class [`Square`](app/src/main/java/org/dii/oop/lesson06/exercise01/Square.java) and make it inherit from the [`Rectangle`](app/src/main/java/org/dii/oop/lesson06/exercise01/Rectangle.java) class with its constructor having a parameter for its side (suppose side) calling the constructor of its parent class as `super(side, side)`.
  

3. Run the code:
   ```
   1. Circle
   2. Rectangle
   3. Square
   4. Display all shape
   5. exit
   Please select [1-5]: 1
   
   Enter radius: 5
   
   1. Circle
   2. Rectangle
   3. Square
   4. Display all shape
   5. exit
   Please select [1-5]: 2
   
   Enter width: 5
   Enter high: 5
   
   1. Circle
   2. Rectangle
   3. Square
   4. Display all shape
   5. exit
   Please select [1-5]: 3
   
   Enter side: 5
   
   1. Circle
   2. Rectangle
   3. Square
   4. Display all shape
   5. exit
   Please select [1-5]: 4
   
   List all shape:
   Name: Circle, Number of side: 0, Area: 78.50, Perimeter: 31.40
   Name: Rectangle, Number of side: 4, Area: 25.00, Perimeter: 20.00
   Name: Square, Number of side: 4, Area: 25.00, Perimeter: 20.00
   
   ```
   
