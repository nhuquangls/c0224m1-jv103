package factory;

import entity.Staff;
import entity.StaffWorkshop;

public class StaffWorkshopFactory implements StaffFactory {
    @Override
    public Staff creat(int id, String name, String phone, String role, String... extraInfo) {
        return new StaffWorkshop(id, name, phone, role, extraInfo[0]);
    }
}
