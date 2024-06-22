package strategy;

import entity.Staff;
import entity.StaffWorkshop;

public class StaffWorkshopStrategy implements StaffStrategy<Staff> {

    @Override
    public String dataToExport(Staff staff) {
        String data = "";
        data += staff.getId() + "," + staff.getName() + "," + staff.getPhone() + "," + staff.getRole();
        data += "," + ((StaffWorkshop) staff).getWorkshopID();
        data += "," + staff.getClass().getSimpleName();
        return data;
    }

    @Override
    public Staff dataToImport(String[] data) {
        if (data.length != 6) return null;
        return new StaffWorkshop(Integer.parseInt(data[0]),data[1], data[2], data[3], data[4]);
    }
}
