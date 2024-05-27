public class Circle extends Shape {
    private double radius;

    public Circle() {
        this.radius = 1;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.getRadius() * this.getRadius();
    }
    public double getPerimeter() {
        return Math.PI * 2 * this.getRadius();
    }
    @Override
    public String toString() {
        return "A Circle with radius " + this.getRadius() +
                ", which is a subclass of " + super.toString();
    }
}
