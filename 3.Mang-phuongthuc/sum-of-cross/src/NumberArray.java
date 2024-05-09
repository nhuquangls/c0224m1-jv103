import java.util.Scanner;
import java.util.Arrays;

public class NumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng và cột: ");
        int rows = scanner.nextInt();
        int cols = rows;
        int[][] array = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Nhập giá trị hàng " + i + " cột " + j);
                array[i][j] = scanner.nextInt();
            }
        }

        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            sum += array[i][i];
            System.out.println("");
        }
        System.out.println("Tổng hàng chéo là: " + sum);

    }
}
