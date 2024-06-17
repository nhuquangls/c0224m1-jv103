package controller;

import entity.Staff;
import manager.fileManager.FileManager;
import manager.staffManager.StaffManager;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);
    private final StaffManager staffManager = new StaffManager();
    private final FileManager fileManager = new FileManager();

    public void showMenu() {
        fileManager.readData(staffManager.getStaffList());
        int choice = -1;
        do {
            System.out.println("1. Add staff");
            System.out.println("2. Edit staff");
            System.out.println("3. Remove staff");
            System.out.println("4. Show list");
            System.out.println("5. Exit");
            choice = scanner.nextInt();
            scanner.nextLine();

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
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        } while (choice != 5);
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
        System.out.println("1. Add Staff Office");
        System.out.println("2. Add Staff Workshop");
        System.out.println("3. Add Staff Shipper");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                staffManager.addStaff(staffManager.newStaff("StaffOffice"));
                break;
            case 2:
                staffManager.addStaff(staffManager.newStaff("StaffWorkshop"));
                break;
            case 3:
                staffManager.addStaff(staffManager.newStaff("StaffShipper"));
                break;
            default:
                System.out.println("Cancel");
                break;
        }
        fileManager.writeData(staffManager.getStaffList());
    }

}

