package com.codegym;

public class CircleTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle();
        circles[1] = new Circle(3.5);
        circles[2] = new Circle(4.5, "indigo", false);

        System.out.println("Area before resizing");
        printAreas(circles);

        resizeCircles(circles);

        System.out.println("\nArea after resizing");
        printAreas(circles);
    }
    public static void printAreas(Circle[] circles) {
        for (Circle circle : circles) {
            System.out.println(circle.getArea());
        }
    }
    public static void resizeCircles(Circle[] circles) {
        for (Circle circle : circles) {
            circle.resize();
        }
    }
}