import java.util.Scanner;
import java.util.Arrays;

public class Array {
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
        for (int i = 0; i < array.length; i++) {
            if (array.length / 2 < i + 1) break;
            int temp;
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println("Mảng đảo ngược: " + Arrays.toString(array));
    }
}
