import user.UserManager;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);
    private final UserManager userManager = new UserManager();
    public void showMenu() {
        userManager.readData();
        int choice = 0;
        do {
            System.out.println("1. Danh sách users");
            System.out.println("2. Thêm user");
            System.out.println("3. Sửa user");
            System.out.println("4. Xoá user");
            System.out.println("5. Thoát");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }
            switch (choice) {
                case 1:
                    userManager.displayUsers();
                    break;
                case 2:
                    addUser();
                    break;
                case 3:
                    editUserByID();
                    break;
                case 4:
                    removeUserByID();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        } while (choice != 5);
    }

    public void addUser() {
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
        userManager.addUser(id, username, password);
    }

    public void editUserByID() {
        System.out.println("Nhập ID: ");
        int id = 0;
        try {
            id = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Nhập ID mới: ");
        int newID = 0;
        try {
            newID = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Nhập username mới: ");
        String newName = scanner.nextLine();
        System.out.println("Nhập password mới: ");
        String newPassword = scanner.nextLine();

        userManager.updateUser(id, newID, newName, newPassword);
    }

    public void removeUserByID() {
        System.out.println("Nhập ID: ");
        int id = 0;
        try {
            id = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        userManager.removeUser(id);
    }
}
