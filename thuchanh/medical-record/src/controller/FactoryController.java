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
        String patientID;
        do {
            patientID = KeyboardInput.getString("Enter patientID (BN-XXX): ");
        }
        while (!RegexPattern.isValidPatientID(patientID));

        String medicalRecordID;
        do {
            medicalRecordID = KeyboardInput.getString("Enter medicalRecordID (BA-XXX): ");
        }
        while (!RegexPattern.isValidRecordID(medicalRecordID));

        String name = KeyboardInput.getString("Enter name: ");

        String hospitalizedDate;
        do {
            hospitalizedDate = KeyboardInput.getString("Enter hospitalizedDate (dd/MM/yyyy): ");
        }
        while (!RegexPattern.isValidDate(hospitalizedDate));


        String dischargedDate;
        do {
            dischargedDate = KeyboardInput.getString("Enter dischargedDate (dd/MM/yyyy): ");
        }
        while (!RegexPattern.isValidDate(dischargedDate));


        String hospitalizationReason = KeyboardInput.getString("Enter hospitalizationReason: ");
        String[] extraInfo = new String[2];
        if (type == 1) {
            extraInfo[0] = KeyboardInput.getString("Enter Inpatient Cost: ");
        }

        if (type == 2) {
            extraInfo[0] = KeyboardInput.getString("Enter Vip Type: ");

            do {
                extraInfo[1] = KeyboardInput.getString("Enter Expiration (dd/MM/yyyy): ");
            }
            while (!RegexPattern.isValidDate(extraInfo[1]));
        }
        return factory.get(type).create(patientID, medicalRecordID, name, hospitalizedDate, dischargedDate, hospitalizationReason, extraInfo);
    }
}
