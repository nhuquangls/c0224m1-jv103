package com.codegym;

public class Square extends Rectangle implements Colorable {
    private double side = 1;

    public Square () {
        super(1, 1);
    }

    public Square (double side) {
        super(side, side);
        this.side = side;
    }

    public Square (double side, String color, boolean filled) {
        super(side, side, color, filled);
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }
    public void setSide(double side) {
        this.side = side;
        super.width = side;
        super.length = side;
    }

    @Override
    public String toString() {
        return "A Square with side ="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }
}
