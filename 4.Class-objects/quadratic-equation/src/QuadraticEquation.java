public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDelta() {
        return this.b * this.b - 4 * a * c;
    }
    public double getRoot1() {
        return (-b + Math.pow(this.getDelta(), 0.5)) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.pow(this.getDelta(), 0.5)) / (2 * a);
    }
}
