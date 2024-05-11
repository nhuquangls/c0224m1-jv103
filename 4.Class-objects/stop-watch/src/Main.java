import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomNumber();
        }

        StopWatch.start();
        Arrays.sort(array);
        StopWatch.stop();
        System.out.println(Arrays.toString(array));
        System.out.println("Thời gian sắp xếp: " + StopWatch.getElapsedTime() + " milliseconds");
    }

    public static int getRandomNumber() {
        return (int) (Math.random() * 1000);
    }
}
