import java.util.Scanner;


public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần in ra: ");
        int quantity = scanner.nextInt();
        int count = 0;
        int number = 2;

        while (count < quantity) {
            boolean check = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}
