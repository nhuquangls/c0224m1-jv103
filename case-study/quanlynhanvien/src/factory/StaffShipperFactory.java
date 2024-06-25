package factory;

import entity.Staff;
import entity.StaffShipper;
import ultils.KeyboardInput;

public class StaffShipperFactory implements StaffFactory {
    @Override
    public Staff create(int id, String name, String phone, String role) {
        String car = KeyboardInput.getString("Enter car: ");
        return new StaffShipper(id, name, phone, role, car);
    }
}
