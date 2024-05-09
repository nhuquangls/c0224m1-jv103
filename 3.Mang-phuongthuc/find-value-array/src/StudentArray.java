import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên: ");
        String inputName = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputName)) {
                System.out.println("Tìm thấy " + inputName + "Tại index: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) System.out.println("Không tìm thấy");
    }
}
