package filemanager;

import patient.NormalPatient;
import patient.Patient;
import patient.VIPPatient;

import java.io.*;
import java.util.List;

public class FileManager {
    private final String pathFile = "src/filemanager/data.csv";
    private final File file = new File(pathFile);
    private int count = 0;

    public FileManager() {
        try {
            if (!file.exists() && file.createNewFile()) {
                System.out.println("Created data file");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void saveData(List<Patient> patientList) {
        StringBuilder data = new StringBuilder();

        for (Patient patient : patientList) {
            count++;
            data.append(count + ",");
            data.append(patient.getMedicalRecordID());
            data.append(",");
            data.append(patient.getName());
            data.append(",");
            data.append(patient.getHospitalizedDate());
            data.append(",");
            data.append(patient.getDischargedDate());
            data.append(",");
            data.append(patient.getHospitalizationReason());


            if (patient instanceof NormalPatient) {
                data.append(",");
                data.append(((NormalPatient) patient).getInpatientCost());
            }
            if (patient instanceof VIPPatient) {
                data.append(",");
                data.append(((VIPPatient) patient).getVipType());
                data.append(",");
                data.append(((VIPPatient) patient).getExpirationDate());
            }
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
