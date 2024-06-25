package strategy.edit;

import entity.Staff;
import entity.StaffWorkshop;
import ultils.KeyboardInput;

public class EditStaffWorkshop implements EditStrategy {
    @Override
    public void EditStaff(Staff staff) {
        String car = KeyboardInput.getString("Enter new workshop ID: ");
        ((StaffWorkshop) staff).setWorkshopID(car);
    }
}
