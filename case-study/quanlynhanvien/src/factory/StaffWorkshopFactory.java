package factory;

import entity.Staff;
import entity.StaffWorkshop;
import ultils.KeyboardInput;

public class StaffWorkshopFactory implements StaffFactory {
    @Override
    public Staff create(int id, String name, String phone, String role) {
        String workshopID = KeyboardInput.getString("Enter workshop ID: ");
        return new StaffWorkshop(id, name, phone, role, workshopID);
    }
}
