package com.codegym;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle();
        rectangles[1] = new Rectangle(2.3, 5.8);
        rectangles[2] = new Rectangle(2.5, 3.8, "orange", true);

        System.out.println("Area before resizing");
        printAreas(rectangles);

        resizeRectangle(rectangles);

        System.out.println("\nArea after resizing");
        printAreas(rectangles);

    }
    public static void printAreas(Rectangle[] rectangles) {
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle.getArea());
        }
    }
    public static void resizeRectangle(Rectangle[] rectangles) {
        for (Rectangle rectangle : rectangles) {
            rectangle.resize();
        }
    }
}
