public class Triangle implements Shape {
    double side1, side2, side3;
    public Triangle() {
        this.side1 = 1;
        this.side2 = 1;
        this.side3 = 1;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double haftPerimeter = this.getPerimeter() / 2;
        return Math.sqrt(haftPerimeter * (haftPerimeter - this.side1)*
                        (haftPerimeter - this.side2)*
                        (haftPerimeter - this.side3));
    }

    @Override
    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }
    @Override
    public String toString() {
        return String.format("Triangle has 3 sides: %f, %f, %f.\nArea: %f \nPerimeter: %f",
                this.getSide1(), this.getSide2(), this.getSide3(), this.getArea(), this.getPerimeter());
    }
}
