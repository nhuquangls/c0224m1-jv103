package manager.fileManager;

import entity.Staff;
import entity.StaffOffice;
import entity.StaffShipper;
import entity.StaffWorkshop;

import java.io.*;
import java.util.List;

public class FileManager implements IFileManager<Staff>{
    private final String pathFile = "src/manager/fileManager/data.csv";
    private final File file = new File(pathFile);

    public FileManager() {
        try {
            if (!file.exists() && file.createNewFile()) {
                System.out.println("Created data file");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void readData(List<Staff> staffList) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] arrayData = line.split(",");
                int arraySize = arrayData.length;
                String staffType = arrayData[arraySize - 1];
                Staff staff = null;

                if (staffType.equals("StaffOffice") && arraySize == 5) {
                    staff = new StaffOffice(Integer.parseInt(arrayData[0]), arrayData[1], arrayData[2], arrayData[3]);
                }
                if (staffType.equals("StaffShipper") && arraySize == 6) {
                    staff = new StaffShipper(Integer.parseInt(arrayData[0]), arrayData[1], arrayData[2], arrayData[3], arrayData[5]);
                }
                if (staffType.equals("StaffWorkshop") && arraySize == 6) {
                    staff = new StaffWorkshop(Integer.parseInt(arrayData[0]), arrayData[1], arrayData[2], arrayData[3], arrayData[5]);
                }
                if (staff != null) staffList.add(staff);
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void writeData(List<Staff> staffList) {
        StringBuilder data = new StringBuilder();
        for (Staff staff : staffList) {
            data.append(staff.getId());
            data.append(",");
            data.append(staff.getName());
            data.append(",");
            data.append(staff.getPhone());
            data.append(",");
            data.append(staff.getRole());
            if (staff instanceof StaffWorkshop) {
                data.append(",");
                data.append(((StaffWorkshop) staff).getWorkshopID());
            }
            if (staff instanceof StaffShipper) {
                data.append(",");
                data.append(((StaffShipper) staff).getCar());
            }

            data.append(",");
            data.append(staff.getClass().getSimpleName());
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


}
