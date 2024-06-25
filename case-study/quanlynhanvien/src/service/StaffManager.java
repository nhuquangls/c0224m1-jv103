package service;

import entity.Staff;
import ultils.KeyboardInput;

import java.util.*;

public class StaffManager{
    private final List<Staff> staffList = new ArrayList<>();


    public List<Staff> getStaffList() {
        return staffList;
    }


    public void addStaff(Staff staff) {
        if (staff != null) {
            staffList.add(staff);
            System.out.println("Added staff");
        }
    }


    public void updateStaff(Staff staff) {
        if (staff == null) {
            System.out.println("Staff not found");
            return;
        }
        EditManager editor = EditManager.getInstance();
        editor.EditStaff(staff);
        System.out.println("Updated staff");
    }


    public void removeStaff(Staff staff) {
        if (staff == null) {
            System.out.println("Staff not found");
            return;
        }

        staffList.removeIf(staffInList -> staffInList.getId() == staff.getId());
        System.out.println("Removed staff");
    }


    public void showList() {
        for (Staff staff : staffList) {
            System.out.println(staff);
        }
    }


    public Staff getStaffByID() {
        int id = KeyboardInput.getInteger("Enter ID: ");
        for (Staff staff : staffList) {
            if (staff.getId() == id) {
                return staff;
            }
        }
        return null;
    }


    public void sort(int type) {
        Comparator<Staff> comparator;
        if (type == 1) {
            comparator = Comparator.comparing(Staff::getId);
        } else if (type == 2) {
            comparator = Comparator.comparing(Staff::getName);
        } else return;
        staffList.sort(comparator);
    }

}
