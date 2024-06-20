package staffmanager;

import entity.Staff;


public interface IStaffManager {
    void addStaff(Staff staff);
    void updateStaff(Staff staff);
    void removeStaff(Staff staff);
    void showList();
}
