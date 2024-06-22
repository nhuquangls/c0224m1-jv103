package factory;

import entity.Staff;

public interface StaffFactory {
    Staff create(int id, String name, String phone, String role, String... extraInfo);
}
