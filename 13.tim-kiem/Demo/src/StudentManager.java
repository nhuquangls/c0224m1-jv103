import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        this.students = new ArrayList<Student>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent (Student object) {
        students.add(object);
    }
    public List<Student> searchStudentByName(String name) {
        List<Student> listFilter = new ArrayList<Student>();
        for (Student student : students) {
            if (student.getName().equals(name)) {
                listFilter.add(student);
            }
        }
        return listFilter;
    }

    public List<Student> searchStudentById(int id) {
        List<Student> listFilter = new ArrayList<Student>();
        for (Student student : students) {
            if (student.getId() == id) {
                listFilter.add(student);
            }
        }
        return listFilter;
    }
}
