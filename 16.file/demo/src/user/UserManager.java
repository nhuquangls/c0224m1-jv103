package user;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserManager {
    private final List<User> USERS = new ArrayList<User>();
    private final File DATA_PATH = new File("./src/data/data.txt");
    private boolean isRead = false;

    private void addUser(int id, String name, String password) {
        User user = new User(id, name, password);
        USERS.add(user);
        if (isRead) writeData(id, name, password);
    }

    private void displayUsers() {
        for (User user : USERS) {
            System.out.println(user);
        }
    }

    private void readData() {
        try {
            FileReader data = new FileReader(DATA_PATH);
            BufferedReader reader = new BufferedReader(data);
            String line;
            while ((line = reader.readLine()) != null) {
                String[] splitLine = line.split(", ");
                if (splitLine.length >= 3) {
                    addUser(Integer.parseInt(splitLine[0]), splitLine[1], splitLine[2]);
                }
            }
            isRead = true;
            reader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void writeData(int id, String name, String password) {
        try {
            FileWriter data = new FileWriter(DATA_PATH, true);
            BufferedWriter writer = new BufferedWriter(data);
            if (DATA_PATH.length() > 0) writer.newLine();
            writer.write(id + ", " + name + ", " + password);
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void showMenu() {
        readData();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Danh sách users");
            System.out.println("2. Thêm user");
            System.out.println("3. Thoát");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayUsers();
                    break;
                case 2:
                    System.out.println("ID: ");
                    int id = 0;
                    try {
                        id = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("Username: ");
                    String username = scanner.nextLine();
                    System.out.println("Password: ");
                    String password = scanner.nextLine();
                    addUser(id, username, password);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        } while (choice != 3);
    }
}
