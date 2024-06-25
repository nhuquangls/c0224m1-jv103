package strategy.edit;

import entity.Staff;
import entity.StaffShipper;
import ultils.KeyboardInput;

public class EditStaffShipper implements EditStrategy {
    @Override
    public void EditStaff(Staff staff) {
        String car = KeyboardInput.getString("Enter new car: ");
        ((StaffShipper) staff).setCar(car);
    }
}
