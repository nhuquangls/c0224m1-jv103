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
                String[] arrData = line.split(",");
                String staffType = arrData[arrData.length - 1];
                Staff staff = null;

                if (staffType.equals("StaffOffice") && arrData.length == 5) {
                    staff = new StaffOffice(Integer.parseInt(arrData[0]), arrData[1], arrData[2], arrData[3]);
                }
                if (staffType.equals("StaffShipper") && arrData.length == 6) {
                    staff = new StaffShipper(Integer.parseInt(arrData[0]), arrData[1], arrData[2], arrData[3], arrData[4]);
                }
                if (staffType.equals("StaffWorkshop") && arrData.length == 6) {
                    staff = new StaffWorkshop(Integer.parseInt(arrData[0]), arrData[1], arrData[2], arrData[3], arrData[4]);
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
