public class CustomThread {
    private int count = 0;
    public synchronized void messenger() {
        String threadName = Thread.currentThread().getName();

        try {
            for (int i = 0; i < 5; i++) {
                notifyAll();
                System.out.println(threadName + " đang chạy");
                Thread.sleep(1000);
                count++;
                System.out.println(count);
                if (count < 10) wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
