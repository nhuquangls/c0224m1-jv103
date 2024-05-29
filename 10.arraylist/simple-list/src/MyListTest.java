public class MyListTest {
    public static void main(String[] args) {
        MyList<String> helloWorld = new MyList<String>();
        helloWorld.add("hello");
        helloWorld.add("world");

        System.out.println(helloWorld.get(1));
    }
}
