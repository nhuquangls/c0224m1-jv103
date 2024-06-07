public class Caculator {
    public static float divide(int a, int b) throws Exception {
        if (b==0) {
            throw new Exception("Division by zero");
        }
        return (float) a/b;
    }
}
