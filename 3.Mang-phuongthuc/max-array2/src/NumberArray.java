import java.util.Scanner;
import java.util.Arrays;

public class NumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng: ");
        int rows = scanner.nextInt();
        System.out.println("Nhập số cột: ");
        int cols = scanner.nextInt();
        int[][] array = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Nhập giá trị hàng " + i + " cột " + j);
                array[i][j] = scanner.nextInt();
            }
        }

        int max = array[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
            System.out.println("");
        }
        System.out.println("Max number: " + max);
    }
}
