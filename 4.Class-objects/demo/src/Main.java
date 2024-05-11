
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("ab01234", "Duy", "duy@gmail.com", "vietnam", 2);
        persons[1] = new Person("ab01234", "Quang", "duy@gmail.com", "vietnam", 3);
        persons[2] = new Person("ab01234", "Linh", "duy@gmail.com", "vietnam", 5);
        persons[3] = new Person("ab01234", "Thuy", "duy@gmail.com", "vietnam", 2);
        persons[4] = new Person("ab01234", "Quan", "duy@gmail.com", "vietnam", 6);

        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getRole() == 2) {
                System.out.println(persons[i].getName());
            }
        }
    }
}
