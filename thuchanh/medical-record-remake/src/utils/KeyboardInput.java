package utils;

import java.util.Scanner;

public class KeyboardInput {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getInteger(String messenger) {
        int type;
        System.out.println(messenger);
        type = scanner.nextInt();
        scanner.nextLine();
        return type;
    }

    public static String getString (String messenger) {
        System.out.println(messenger);
        return scanner.nextLine();
    }
}
