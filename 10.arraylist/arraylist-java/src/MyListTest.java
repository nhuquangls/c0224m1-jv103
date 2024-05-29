public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listNumber = new MyList<>(3);
        listNumber.add(6);
        listNumber.add(7);
        listNumber.add(8);
        System.out.println(listNumber);

        listNumber.add(2,20);
        System.out.println(listNumber);

        System.out.println("Element removed: " + listNumber.remove(2));
        System.out.println(listNumber);

        System.out.println("The number of elements in this list: " + listNumber.size());

        listNumber.ensureCapacity(10);
        System.out.println(listNumber);

        listNumber.clear();
        System.out.println(listNumber);
    }
}
