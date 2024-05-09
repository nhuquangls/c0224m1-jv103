import java.util.Scanner;
import java.util.Arrays;

public class NumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng: ");
        int rows = scanner.nextInt();
        System.out.println("Nhập số cột: ");
        int cols = scanner.nextInt();
        double[][] array = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Nhập giá trị hàng " + i + " cột " + j);
                array[i][j] = scanner.nextDouble();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        int col;
        do {
            System.out.println("Nhập cột cần tính tổng: ");
            col = scanner.nextInt();
        } while (col < 0 || col >= cols);
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            sum += array[i][col];
        }
        System.out.println("Tổng của cột " + col + " là: " + sum);
    }
}
