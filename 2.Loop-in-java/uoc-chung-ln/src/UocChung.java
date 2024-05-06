import java.util.Scanner;

public class UocChung {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = input.nextInt();
        System.out.println("Enter b: ");
        b = input.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 && b == 0) {
            System.out.println("a vs b không có UCLN");
        } else if (a == 0) {
            System.out.println("UCLN của a vs b là: " + b);
        } else if (b == 0) {
            System.out.println("UCLN của a vs b là: " + a);
        } else if (a == b) {
            System.out.println("UCLN của a vs b là: " + a);
        } else {
            if (b > a) {
                int c = b;
                b = a;
                a = c;
            }
            int ucln = 1;
            for (int i = 1; i <= b; i++) {
                if (b % i == 0) {
                    if (i > ucln) {
                        ucln = i;
                    }
                }
            }
            System.out.printf("UCLN của a vs b là: " + ucln);
        }
    }
}
