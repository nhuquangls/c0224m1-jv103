import java.util.Scanner;
import java.util.Arrays;

public class NumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử thứ " + i);
            array[i] = scanner.nextInt();
        }
        System.out.println("Mảng: " + Arrays.toString(array));
        System.out.println("Min number of Array: " + findMinNumber(array));
    }
    public static int findMinNumber (int[] array) {
        int minNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }
        return minNumber;
    }
}
