package staffmanager;

import entity.Staff;
import entity.StaffShipper;
import entity.StaffWorkshop;
import ultils.KeyboardInput;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StaffManager implements IStaffManager {
    private final List<Staff> staffList = new ArrayList<Staff>();


    public List<Staff> getStaffList() {
        return staffList;
    }

    @Override
    public void addStaff(Staff staff) {
        staffList.add(staff);
        System.out.println("Added staff");
    }

    @Override
    public void updateStaff(Staff staff) {
        editStaff(staff);
        System.out.println("Edited staff");
    }

    @Override
    public void removeStaff(Staff staff) {
        if (staff == null) {
            System.out.println("Staff not found");
            return;
        }

        Iterator<Staff> iterator = staffList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == staff.getId()) {
                iterator.remove();
            }
        }
        System.out.println("Removed staff");
    }

    @Override
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
