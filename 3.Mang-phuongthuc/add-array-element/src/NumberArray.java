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
        System.out.println("Thêm value tại index: ");
        int index = scanner.nextInt();
        System.out.println("Nhập value muốn thêm: ");
        int value = scanner.nextInt();
        array = addItemByIndex(index, value, array);
        System.out.println(Arrays.toString(array));
    }
    public static int[] addItemByIndex(int index, int value, int[] array) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            if (i == array.length) break;
            if (i < index) {
                newArray[i] = array[i];
            } else if (i == index) {
                newArray[i] = value;
            } else {
                newArray[i] = array[i - 1];
            }
        }
        return newArray;
    }
}
