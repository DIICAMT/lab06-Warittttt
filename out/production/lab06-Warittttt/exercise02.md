## [Lesson06](index.md) > Exercise02:

1. Open class [App](app/src/main/java/org/dii/oop/lesson06/exercise01/App.java) in package `org.dii.oop.App` and edit the code as display below: 
   ```
   package org.dii.oop;

   import org.dii.oop.lesson06.org.dii.oop.lesson06.exercise02.org.dii.oop.lesson06.exercise02.Lesson;
   public class App {
     public static void main(String[] args) {
       lesson.run();
    }
   }
   ```

2. Edit class [Lesson](app/src/main/java/org/dii/oop/lesson06/exercise02/Lesson.java) in package `org.dii.oop.lesson06.org.dii.oop.lesson06.org.dii.oop.lesson06.exercise02.org.dii.oop.lesson06.exercise02` to match your Exercise01' Lesson.java at least the logic part.

3. At this point, your org.dii.oop.lesson06.org.dii.oop.lesson06.exercise02.org.dii.oop.lesson06.exercise02 should be identical to org.dii.oop.lesson06.org.dii.oop.lesson06.exercise01.

4. Extend ArrayList to be your own class. The error may occur a lot, just try to figure it out.

5. The new functions in extended ArrayList should have this custom functions.

    - listAllShapes() 
        the result of this function is to print the shape object detail as displayed in the option 4 in excercise01.

    - sumArea() 
        the result of this function is to print area summation of all stored shapes in your list.

6. Use listAllShapes() function from extended arrayList to display the result as option 4 selected.

7. Use sumArea() function from extended arrayList to display the result as new option 5 selected.

7. Run the code:
   ```
   1. Circle
   2. Rectangle
   3. Square
   4. Display all shape
   5. Show summation of area
   6. Exit
   Please select [1-5]: 1
   
   Enter radius: 5
   
   1. Circle
   2. Rectangle
   3. Square
   4. Display all shape
   5. Show summation of area
   6. Exit
   Please select [1-5]: 2
   
   Enter width: 5
   Enter high: 5
   
   1. Circle
   2. Rectangle
   3. Square
   4. Display all shape
   5. Show summation of area
   6. Exit
   Please select [1-5]: 3
   
   Enter side: 5
   
   1. Circle
   2. Rectangle
   3. Square
   4. Display all shape
   5. Show summation of area
   6. Exit
   Please select [1-5]: 4
   
   List all shape:
   Name: Circle, Number of side: 0, Area: 78.50, Perimeter: 31.40
   Name: Rectangle, Number of side: 4, Area: 25.00, Perimeter: 20.00
   Name: Square, Number of side: 4, Area: 25.00, Perimeter: 20.00

   1. Circle
   2. Rectangle
   3. Square
   4. Display all shape
   5. Show summation of area
   6. Exit
   Please select [1-5]: 5
   
   summation of area is 128.50
   
   ```
   
