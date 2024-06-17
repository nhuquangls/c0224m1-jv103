public class Main {
    public static void main(String[] args) {
        CustomThread thread = new CustomThread();
        Runnable task1 = thread::messenger;
        Runnable task2 = thread::messenger;

        Thread thread1 = new Thread(task1);
        thread1.setName("Luồng 1");
        Thread thread2 = new Thread(task2);
        thread2.setName("Luồng 2");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

