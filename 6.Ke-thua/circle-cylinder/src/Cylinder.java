public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
        super();
        this.height = 5;
    }
    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * Math.pow(this.getRadius(), 2) * this.getHeight();
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * (getRadius() + getHeight());
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "color='" + this.getColor() + '\'' +
                ", radius=" + this.getRadius() +
                ", height=" + this.getHeight() +
                '}';
    }
}
