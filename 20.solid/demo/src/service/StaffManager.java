package service;

import entity.Staff;
import entity.StaffShipper;
import entity.StaffWorkshop;
import ultils.KeyboardInput;

import java.util.*;

public class StaffManager implements IStaffManager {
    private final List<Staff> staffList = new ArrayList<>();


    public List<Staff> getStaffList() {
        return staffList;
    }

    @Override
    public void addStaff(Staff staff) {
        if (staff != null) {
            staffList.add(staff);
            System.out.println("Added staff");
        }
    }

    @Override
    public void updateStaff(Staff staff) {
        if (staff == null) {
            System.out.println("Staff not found");
            return;
        }

        editStaff(staff);
        System.out.println("Updated staff");
    }

    @Override
    public void removeStaff(Staff staff) {
        if (staff == null) {
            System.out.println("Staff not found");
            return;
        }

        staffList.removeIf(staffInList -> staffInList.getId() == staff.getId());
        System.out.println("Removed staff");
    }

    @Override
    public void showList() {
        for (Staff staff : staffList) {
            System.out.println(staff);
        }
    }

    @Override
    public Staff getStaffByID() {
        int id = KeyboardInput.getInteger("Enter ID: ");
        for (Staff staff : staffList) {
            if (staff.getId() == id) {
                return staff;
            }
        }
        return null;
    }

    @Override
    public void sort(int type) {
        Comparator<Staff> comparator;
        if (type == 1) {
            comparator = Comparator.comparing(Staff::getId);
        } else if (type == 2) {
            comparator = Comparator.comparing(Staff::getName);
        } else return;
        staffList.sort(comparator);
    }

    private void editStaff(Staff staff) {
        if (staff == null) {
            System.out.println("Staff not found");
            return;
        }

        staff.setId(KeyboardInput.getInteger("Enter new ID: "));
        staff.setName(KeyboardInput.getString("Enter new name: "));
        staff.setPhone(KeyboardInput.getString("Enter new phone: "));
        staff.setRole(KeyboardInput.getString("Enter new role: "));

        if (staff instanceof StaffShipper) {
            ((StaffShipper) staff).setCar(KeyboardInput.getString("Enter new car: "));
        }
        if (staff instanceof StaffWorkshop) {
            ((StaffWorkshop) staff).setWorkshopID(KeyboardInput.getString("Enter new workshopID: "));
        }
    }

}
