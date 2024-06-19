package factory;

import entity.Staff;
import entity.StaffOffice;

public class StaffOfficeFactory implements StaffFactory {
    @Override
    public Staff creat(int id, String name, String phone, String role, String... extraInfo) {
        return new StaffOffice(id, name, phone, role);
    }
}
