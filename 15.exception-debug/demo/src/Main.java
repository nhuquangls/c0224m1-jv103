import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ngày: ");
        int date = scanner.nextInt();
        System.out.println("Tháng: ");
        int month = scanner.nextInt();
        System.out.println("Năm: ");
        int year = scanner.nextInt();
        CaculatorLifeTime person = new CaculatorLifeTime();

        try {
            System.out.println("Bạn đã sống: " + person.getDaysLived(date, month, year) + " ngày");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
