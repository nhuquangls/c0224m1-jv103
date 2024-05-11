import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập c: ");
        double c = scanner.nextDouble();

        QuadraticEquation equation1 = new QuadraticEquation(a, b, c);
        if (equation1.getDelta() == 0) {
            System.out.println("Nghiệm của PT là: " + equation1.getRoot1());
        } else if (equation1.getDelta() > 0) {
            System.out.println("Nghiệm của PT là: " + equation1.getRoot1() + " và " + equation1.getRoot2());
        } else {
            System.out.println("PT vô nghiệm");
        }
    }
}
