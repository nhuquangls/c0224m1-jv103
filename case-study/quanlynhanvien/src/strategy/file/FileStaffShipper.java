package strategy.file;

import entity.Staff;
import entity.StaffShipper;

public class FileStaffShipper implements FileStrategy<Staff> {
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
        if (data.length != 7) return null;
        return new StaffShipper(Integer.parseInt(data[1]),data[2], data[3], data[4], data[5]);
    }
}
