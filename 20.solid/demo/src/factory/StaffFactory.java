package factory;

import entity.Staff;

public interface StaffFactory {
    Staff creat(int id, String name, String phone, String role, String... extraInfo);
}
