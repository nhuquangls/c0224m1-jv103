package filemanager;

import entity.Staff;

public interface StaffStrategy<E> {
    String dataToExport(E object);
    Staff dataToImport(String[] dataFromFile);
}
