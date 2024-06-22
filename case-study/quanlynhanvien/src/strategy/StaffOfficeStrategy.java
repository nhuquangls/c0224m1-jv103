package strategy;

import entity.Staff;
import entity.StaffOffice;

public class StaffOfficeStrategy implements StaffStrategy<Staff> {

    @Override
    public String dataToExport(Staff staff) {
        return staff.getId() + "," + staff.getName() + "," + staff.getPhone() + "," + staff.getRole() + "," + staff.getClass().getSimpleName();
    }

    @Override
    public Staff dataToImport(String[] data) {
        if (data.length != 5) return null;
        return new StaffOffice(Integer.parseInt(data[0]),data[1], data[2], data[3]);
    }
}
