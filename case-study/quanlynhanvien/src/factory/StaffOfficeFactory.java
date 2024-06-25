package factory;

import entity.Staff;
import entity.StaffOffice;

public class StaffOfficeFactory implements StaffFactory {
    @Override
    public Staff create(int id, String name, String phone, String role) {
        return new StaffOffice(id, name, phone, role);
    }
}
