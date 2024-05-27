package com.codegym;

public class MainTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square(5);
        printShapes(shapes);
    }
    public static void printShapes (Shape[] shapes) {
        for (Shape shape : shapes) {
            if (shape instanceof Square) {
                ((Square) shape).howToColor();
            }
            System.out.println(shape.toString());
        }
    }
}
