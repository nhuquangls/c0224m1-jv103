package service;

import entity.Staff;
import strategy.edit.EditStaffOffice;
import strategy.edit.EditStaffShipper;
import strategy.edit.EditStaffWorkshop;
import strategy.edit.EditStrategy;
import ultils.KeyboardInput;

import java.util.HashMap;
import java.util.Map;

public class EditManager {
    private static EditManager instance;
    Map<String, EditStrategy> strategy = new HashMap<>();

    private EditManager() {
        strategy.put("StaffOffice", new EditStaffOffice());
        strategy.put("StaffShipper", new EditStaffShipper());
        strategy.put("StaffWorkshop", new EditStaffWorkshop());

    }
    public static EditManager getInstance() {
        if (instance == null) {
            instance = new EditManager();
        }
        return instance;
    }

    public void EditStaff(Staff staff) {
        staff.setId(KeyboardInput.getInteger("Enter new ID: "));
        staff.setName(KeyboardInput.getString("Enter new name: "));
        staff.setPhone(KeyboardInput.getString("Enter new phone: "));
        staff.setRole(KeyboardInput.getString("Enter new role: "));

        String key = staff.getClass().getSimpleName();
        strategy.get(key).EditStaff(staff);
    }
}
