package student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void showMenu() {
        System.out.println("1: Create new student");
        System.out.println("2: Show list student");
        System.out.println("3: Remove students");
        System.out.println("4: Show student by index: ");
        System.out.println("5: Edit student: ");
        System.out.println("6: Exit");
    }

    public static void createNewStudent() {
        System.out.println("Enter id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());
        Student student = new Student(id, name, age);
        students.add(student);
    }

    public static void removeStudent() {
        System.out.println("Enter index: ");
        int indexRemove = Integer.parseInt(scanner.nextLine());
        students.remove(indexRemove);
    }

    public static void showListStudent() {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    public static void showStudentByIndex() {
        System.out.println("Enter index: ");
        int indexShow = Integer.parseInt(scanner.nextLine());
        students.get(indexShow).toString();
    }

    public static void editStudent() {
        System.out.println("Enter index: ");
        int indexEdit = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());
        Student student = new Student(id, name, age);
        students.set(indexEdit, student);
    }

    public static void start() {
        int choice = 0;
        do {
            showMenu();
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    createNewStudent();
                    break;
                case 2:
                    showListStudent();
                    break;
                case 3:
                    removeStudent();
                    break;
                case 4:
                    showStudentByIndex();
                    break;
                case 5:
                    editStudent();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        } while (choice != 6);
    }
}
