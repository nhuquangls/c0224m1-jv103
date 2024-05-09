import java.util.Scanner;
import java.util.Arrays;

public class NumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử mảng 1: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Nhập phần tử thứ " + i + " của mảng 1: ");
            array1[i] = scanner.nextInt();
        }

        System.out.println("Nhập số lượng phần tử mảng 2: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Nhập phần tử thứ " + i + " của mảng 2: ");
            array2[i] = scanner.nextInt();
        }
        System.out.println("Mảng 1: " + Arrays.toString(array1));
        System.out.println("Mảng 2: " + Arrays.toString(array2));
        System.out.println("mảng 3: " + Arrays.toString(mergeArray(array1, array2)));

    }

    public static int[] mergeArray(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array3.length; i++) {
            if (i < array1.length) {
                array3[i] = array1[i];
            } else {
                array3[i] = array2[i - array1.length];
            }
        }
        return array3;
    }
}
