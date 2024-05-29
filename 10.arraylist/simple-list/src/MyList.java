public class MyList<E> {
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private E[] elements = (E[]) new Object[DEFAULT_CAPACITY];

    public MyList() {
    }

    public void add(E element) {
        if (size == DEFAULT_CAPACITY) {
            System.out.println("MyList is full");
            return;
        }
        elements[size] = element;
        size++;
    }

    public E get(int index) {
        return elements[index];
    }
}
