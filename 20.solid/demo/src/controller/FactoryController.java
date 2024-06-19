package controller;

import entity.Staff;
import factory.StaffFactory;
import factory.StaffOfficeFactory;
import factory.StaffShipperFactory;
import factory.StaffWorkshopFactory;
import ultils.KeyboardInput;

import java.util.HashMap;
import java.util.Map;

public class FactoryController {
    Map<Integer, StaffFactory> factories = new HashMap<>();

    public FactoryController() {
        factories.put(1, new StaffOfficeFactory());
        factories.put(2, new StaffShipperFactory());
        factories.put(3, new StaffWorkshopFactory());
    }

    public Staff newStaff(int key) {
        int id = KeyboardInput.getInteger("Enter ID: ");
        String name = KeyboardInput.getString("Enter name: ");
        String phone = KeyboardInput.getString("Enter phone: ");
        String role = KeyboardInput.getString("Enter role:");
        String extraInfo = null;

        if (key == 2) {
            extraInfo = KeyboardInput.getString("Enter car: ");
        }

        if (key == 3) {
            extraInfo = KeyboardInput.getString("Enter workshopID: ");
        }

        return factories.get(key).creat(id, name, phone, role, extraInfo);
    }
}
