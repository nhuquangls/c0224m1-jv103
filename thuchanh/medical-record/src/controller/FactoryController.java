package controller;

import factory.NormalPatientFactory;
import factory.PatientFactory;
import factory.VIPPatientFactory;
import patient.Patient;
import ultils.KeyboardInput;
import ultils.RegexPattern;

import java.util.HashMap;
import java.util.Map;

public class FactoryController {
    Map<Integer, PatientFactory> factory = new HashMap<>();
    public FactoryController() {
        factory.put(1, new NormalPatientFactory());
        factory.put(2, new VIPPatientFactory());
    }

    public Patient newPatient(int type) {
        String patientID = KeyboardInput.getString("Enter patientID: ");
        String medicalRecordID = KeyboardInput.getString("Enter medicalRecordID: ");
        String name = KeyboardInput.getString("Enter name: ");
        String hospitalizedDate;
        while (true) {
            hospitalizedDate = KeyboardInput.getString("Enter hospitalizedDate (dd/MM/yyyy): ");
            if (RegexPattern.isValidDate(hospitalizedDate)) {
                break;
            } else {
                System.out.println("Invalid date format. Please try again.");
            }
        }


        String dischargedDate;

        while (true) {
            dischargedDate = KeyboardInput.getString("Enter dischargedDate (dd/MM/yyyy): ");
            if (RegexPattern.isValidDate(dischargedDate)) {
                break;
            } else {
                System.out.println("Invalid date format. Please try again.");
            }
        }


        String hospitalizationReason = KeyboardInput.getString("Enter hospitalizationReason: ");
        String[] extraInfo = new String[2];
        if (type == 1) {
            extraInfo[0] = KeyboardInput.getString("Enter Inpatient Cost: ");
        }

        if (type == 2) {
            extraInfo[0] = KeyboardInput.getString("Enter Vip Type: ");

            while (true) {
                extraInfo[1] = KeyboardInput.getString("Enter Expiration Date (dd/MM/yyyy): ");
                if (RegexPattern.isValidDate(extraInfo[1])) {
                    break;
                } else {
                    System.out.println("Invalid date format. Please try again.");
                }
            }
        }
        return factory.get(type).create(patientID, medicalRecordID, name, hospitalizedDate, dischargedDate, hospitalizationReason, extraInfo);
    }
}
