package filemanager;

import entity.Staff;
import entity.StaffShipper;

public class StaffShipperStrategy implements StaffStrategy<Staff> {
    @Override
    public String dataToExport(Staff staff) {
        String data = "";
        data += staff.getId() + "," + staff.getName() + "," + staff.getPhone() + "," + staff.getRole();
        data += "," + ((StaffShipper) staff).getCar();
        data += "," + staff.getClass().getSimpleName();
        return data;
    }

    @Override
    public Staff dataToImport(String[] data) {
        if (data.length != 6) return null;
        return new StaffShipper(Integer.parseInt(data[0]),data[1], data[2], data[3], data[4]);
    }
}
