public class StopWatch {
    private static long startTime, endTime;

    public StopWatch() {
    }

    public static void start() {
        startTime = System.currentTimeMillis();
    }

    public static void stop() {
        endTime = System.currentTimeMillis();
    }

    public static long getElapsedTime() {
        return endTime - startTime;
    }
}
