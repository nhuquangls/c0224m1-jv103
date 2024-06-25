package strategy.file;

import entity.Staff;

public interface FileStrategy<E> {
    String dataToExport(E object);
    Staff dataToImport(String[] dataFromFile);
}
