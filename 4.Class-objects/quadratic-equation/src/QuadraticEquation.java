public class QuadraticEquation {
    private static double a, b, c;

    public QuadraticEquation() {

    }

    public static void setA(double a) {
        QuadraticEquation.a = a;
    }

    public static void setB(double b) {
        QuadraticEquation.b = b;
    }

    public static void setC(double c) {
        QuadraticEquation.c = c;
    }

    public static double getDelta() {
        return b * b - 4 * a * c;
    }
    public static double getRoot1() {
        return (-b + Math.pow(getDelta(), 0.5)) / (2 * a);
    }

    public static double getRoot2() {
        return (-b - Math.pow(getDelta(), 0.5)) / (2 * a);
    }
}
