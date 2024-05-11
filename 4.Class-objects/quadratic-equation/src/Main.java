import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        QuadraticEquation.setA(scanner.nextDouble());
        System.out.println("Nhập b: ");
        QuadraticEquation.setB(scanner.nextDouble());
        System.out.println("Nhập c: ");
        QuadraticEquation.setC(scanner.nextDouble());

        if (QuadraticEquation.getDelta() == 0) {
            System.out.println("Nghiệm của PT là: " + QuadraticEquation.getRoot1());
        } else if (QuadraticEquation.getDelta() > 0) {
            System.out.println("Nghiệm của PT là: " + QuadraticEquation.getRoot1() + " và " + QuadraticEquation.getRoot2());
        } else {
            System.out.println("PT vô nghiệm");
        }
    }
}
