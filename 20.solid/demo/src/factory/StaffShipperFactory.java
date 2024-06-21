package factory;

import entity.Staff;
import entity.StaffShipper;

public class StaffShipperFactory implements StaffFactory {
    @Override
    public Staff create(int id, String name, String phone, String role, String... extraInfo) {
        return new StaffShipper(id, name, phone, role, extraInfo[0]);
    }
}
