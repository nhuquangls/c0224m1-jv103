import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();
        Student s1 = new Student("012", "Nguyen Van A");
        Student s2 = new Student("025", "Nguyen Van B");

        students.put("A", s1);
        students.put("B", s2);

        System.out.println(students.get("A"));
    }
}
