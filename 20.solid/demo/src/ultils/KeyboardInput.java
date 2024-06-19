package ultils;

import java.util.Scanner;

public class KeyboardInput {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getInteger(String messenger) {
        while (true) {
            System.out.println(messenger);
            try {
                int id = scanner.nextInt();
                scanner.nextLine();
                return id;
            } catch (Exception e) {
                System.out.println("Enter a Integer");
                scanner.nextLine();
            }
        }
    }

    public static String getString(String messenger) {
        System.out.println(messenger);
        return scanner.nextLine();
    }
}
