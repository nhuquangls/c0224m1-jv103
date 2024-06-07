import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1,"John",21, "male");
        Student s2 = new Student(2,"Jane",22, "female");
        Student s3 = new Student(2,"Jane",22, "female");
        Student s4 = new Student(2,"Jane",22, "female");

        StudentManager studentManager = new StudentManager();
        studentManager.addStudent(s1);
        studentManager.addStudent(s2);
        studentManager.addStudent(s3);
        studentManager.addStudent(s4);

        List<Student> searchByName = studentManager.searchStudentByName("Jane");
        for (Student student : searchByName) {
            System.out.println(student);
        }

        List<Student> searchById = studentManager.searchStudentById(1);
        for (Student student : searchById) {
            System.out.println(student);
        }
    }
}
