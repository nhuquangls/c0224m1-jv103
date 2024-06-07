import java.util.Arrays;

public class TestInsertionSort {
    public static void main(String[] args) {
        int[] arr = {6, 2, 3, 4, 5, 1};

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));



    }

    public static void insertionSort(int[] array) {
        if (array.length < 2) return;
        for (int i = 1; i < array.length; i++) {
            int value = array[i];
            int currentIndex = i;
            while (currentIndex > 0 && value < array[currentIndex - 1]) {
                array[currentIndex] = array[currentIndex - 1];
                currentIndex--;
            }
            array[currentIndex] = value;
        }
    }
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
