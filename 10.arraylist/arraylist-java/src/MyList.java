import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private E[] elements;

    public MyList() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = (E[]) new Object[capacity];
    }

    public void add(E element) {
        if (size == elements.length) {
            System.out.println("My List is full");
            return;
        }
        elements[size] = element;
        size++;
    }

    public void add(int index, E element) {
        if (!isValid(index)) {
            System.out.println("Index does not exist");
            return;
        } else {
            E[] newElements = (E[]) new Object[elements.length + 1];
            int count = 0;
            for (int i = 0; i < elements.length; i++) {
                if (index == i) {
                    count++;
                }
                newElements[count] = elements[i];
                count++;
            }
            newElements[index] = element;
            elements = newElements;
        }
        size++;
    }

    public E remove(int index) {
        if (!isValid(index)) return null;
        E elementRemoved = elements[index];
        E[] newElements = (E[]) new Object[elements.length - 1];
        int count = 0;
        for (int i = 0; i < newElements.length; i++) {
            if (index == i) {
                count++;
            }
            newElements[i] = elements[count];
            count++;
        }
        elements = newElements;
        size--;
        return elementRemoved;
    }

    public int size() {
        return size;
    }

    public E[] clone() {
        E[] cloneElements = (E[]) new Object[elements.length];
        for (int i = 0; i < size; i++) {
            cloneElements[i] = elements[i];
        }
        return cloneElements;
    }

    public boolean contains(E object) {
        for (E element : elements) {
            if (object.equals(elements)) return true;
        }
        return false;
    }

    public void ensureCapacity(int minCapacity) {
        if (elements.length < minCapacity) {
            E[] newElements = (E[]) new Object[minCapacity];
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
    }

    public int indexOf(E object) {
        for (int i = 0; i < size; i++) {
            if (object.equals(elements[i])) return i;
        }
        return -1;
    }

    public E get(int index) {
        if (!isValid(index)) {
            return null;
        }
        return elements[index];
    }

    public void clear() {
        E[] newElements = (E[]) new Object[elements.length];
        elements = newElements;
    }
    private boolean isValid(int index) {
        return index >= 0 && index < size;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}
