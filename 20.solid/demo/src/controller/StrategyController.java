package controller;

import entity.Staff;
import strategy.StaffOfficeStrategy;
import strategy.StaffShipperStrategy;
import strategy.StaffStrategy;
import strategy.StaffWorkshopStrategy;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StrategyController {
    private final String pathFile = "src/data/data.csv";
    private final File file = new File(pathFile);
    Map<String, StaffStrategy<Staff>> strategy = new HashMap<>();

    public StrategyController() {
        try {
            if (!file.exists() && file.createNewFile()) {
                System.out.println("Created data file");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        strategy.put("StaffOffice", new StaffOfficeStrategy());
        strategy.put("StaffShipper", new StaffShipperStrategy());
        strategy.put("StaffWorkshop", new StaffWorkshopStrategy());
    }

    public void writeData(List<Staff> staffList) {
        StringBuilder data = new StringBuilder();
        for (Staff staff : staffList) {
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
