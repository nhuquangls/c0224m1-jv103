import java.util.Scanner;

public class UsdToVnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much USD do you have in your wallet?");
        double usd = scanner.nextDouble();
        double vnd = usd * 25000;
        System.out.println("You have " + vnd + " vnd");
    }
}
