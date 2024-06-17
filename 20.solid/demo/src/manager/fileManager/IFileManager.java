package manager.fileManager;

import java.util.List;

public interface IFileManager<E> {
    void readData(List<E> dataList);

    void writeData(List<E> dataList);
}
