package service;

import entity.Staff;


public interface IStaffManager {
    void addStaff(Staff staff);
    void updateStaff(Staff staff);
    void removeStaff(Staff staff);
    Staff getStaffByID();
    void showList();
    void sort(int type);
}
