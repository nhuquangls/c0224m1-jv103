package manager.staffManager;

import entity.Staff;
import entity.StaffOffice;
import entity.StaffShipper;
import entity.StaffWorkshop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StaffManager implements IStaffManager {
    private final List<Staff> staffList = new ArrayList<Staff>();
    private final Scanner scanner = new Scanner(System.in);
    private int id;
    private String name;
    private String phone;
    private String role;
    private String workshopID;
    private String car;

    public List<Staff> getStaffList() {
        return staffList;
    }

    @Override
    public void addStaff(Staff staff) {
        staffList.add(staff);
    }

    @Override
    public void updateStaff(Staff staff) {
        editStaff(staff);
    }

    @Override
    public void removeStaff(Staff staff) {
        Iterator<Staff> iterator = staffList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == staff.getId()) {
                iterator.remove();
            }
        }
    }

    @Override
    public void showList() {
        for (Staff staff : staffList) {
            System.out.println(staff);
        }
    }

    public Staff getStaffByID() {
        System.out.println("Enter id: ");
        id = Integer.parseInt(scanner.nextLine());
        for (Staff staff : staffList) {
            if (staff.getId() == id) {
                return staff;
            }
        }
        return null;
    }

    private void editStaff(Staff staff) {
        String staffType = staff.getClass().getSimpleName();
        inputProperties(staffType);

        staff.setId(id);
        staff.setName(name);
        staff.setPhone(phone);
        staff.setRole(role);
        if (staff instanceof StaffShipper) ((StaffShipper) staff).setCar(car);
        if (staff instanceof StaffWorkshop) ((StaffWorkshop) staff).setWorkshopID(workshopID);
    }

    public Staff newStaff(String staffType) {
        Staff staff = null;
        inputProperties(staffType);

        if (staffType.equals("StaffOffice")) {staff = new StaffOffice(id, name, phone, role);}
        if (staffType.equals("StaffWorkshop")) {staff = new StaffWorkshop(id, name, phone, role, workshopID);}
        if (staffType.equals("StaffShipper")) { staff = new StaffShipper(id, name, phone, role, car);}

        return staff;
    }

    private void inputProperties(String staffType) {
        System.out.println("Enter ID: ");
        id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter name: ");
        name = scanner.nextLine();

        System.out.println("Enter phone: ");
        phone = scanner.nextLine();

        System.out.println("Enter role: ");
        role = scanner.nextLine();

        if (staffType.equals("StaffWorkshop")) {
            System.out.println("Enter workshopID: ");
            workshopID = scanner.nextLine();
        }

        if (staffType.equals("StaffShipper")) {
            System.out.println("Enter car: ");
            car = scanner.nextLine();
        }
    }

}
