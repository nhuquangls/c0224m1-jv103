package controller;

import service.FileManager;
import service.StaffManager;
import ultils.KeyboardInput;

public class MainController {
    private final StaffManager staffManager = new StaffManager();
    private final FactoryController factoryController = new FactoryController();
    private final FileManager fileManager = FileManager.getInstance();

    public void showMenu() {
        fileManager.readData(staffManager.getStaffList());
        int choice = -1;
        do {
            System.out.println("1. Add staff");
            System.out.println("2. Edit staff");
            System.out.println("3. Remove staff");
            System.out.println("4. Show list");
            System.out.println("5. Sort");
            System.out.println("6. Save & Exit");
            choice = KeyboardInput.getInteger("Choose an option");

            switch (choice) {
                case 1:
                    addStaff();
                    break;
                case 2:
                    editStaff();
                    break;
                case 3:
                    removeStaff();
                    break;
                case 4:
                    staffManager.showList();
                    break;
                case 5:
                    sort();
                    break;
                case 6:
                    fileManager.writeData(staffManager.getStaffList());
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        } while (choice != 6);
    }

    private void removeStaff() {
        staffManager.removeStaff(staffManager.getStaffByID());
        fileManager.writeData(staffManager.getStaffList());
    }

    private void editStaff() {
        staffManager.updateStaff(staffManager.getStaffByID());
        fileManager.writeData(staffManager.getStaffList());
    }

    private void addStaff() {
        System.out.println("1. Staff Office");
        System.out.println("2. Staff Shipper");
        System.out.println("3. Staff Workshop");
        int key = KeyboardInput.getInteger("Choose an option");

        staffManager.addStaff(factoryController.newStaff(key));
    }
    private void sort() {
        System.out.println("1. Sort By ID");
        System.out.println("2. Sort By Name");
        int type = KeyboardInput.getInteger("Choose an option");

        staffManager.sort(type);
    }

}

