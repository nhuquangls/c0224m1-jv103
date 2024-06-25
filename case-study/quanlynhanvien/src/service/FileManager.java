package service;

import entity.Staff;
import strategy.file.FileStaffOffice;
import strategy.file.FileStaffShipper;
import strategy.file.FileStrategy;
import strategy.file.FileStaffWorkshop;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileManager {
    private static FileManager instance;
    private final String pathFile = "src/data/data.csv";
    private final File file = new File(pathFile);
    Map<String, FileStrategy<Staff>> strategy = new HashMap<>();
    private int count = 0;

    private FileManager() {
        try {
            if (!file.exists() && file.createNewFile()) {
                System.out.println("Created data file");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        strategy.put("StaffOffice", new FileStaffOffice());
        strategy.put("StaffShipper", new FileStaffShipper());
        strategy.put("StaffWorkshop", new FileStaffWorkshop());
    }
    public static FileManager getInstance() {
        if (instance == null) {
            instance = new FileManager();
        }
        return instance;
    }

    public void writeData(List<Staff> staffList) {
        StringBuilder data = new StringBuilder();
        for (Staff staff : staffList) {
            count++;
            data.append(count);
            data.append(",");
            data.append(strategy.get(staff.getClass().getSimpleName()).dataToExport(staff));
            data.append("\n");
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(data.toString());
            writer.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void readData(List<Staff> staffList) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] splitLine = line.split(",");
                String type = splitLine[splitLine.length - 1];

                staffList.add(strategy.get(type).dataToImport(splitLine));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
