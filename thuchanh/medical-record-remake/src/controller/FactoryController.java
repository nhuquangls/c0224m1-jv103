package controller;

import factory.NormalPatientFactory;
import factory.PatientFactory;
import factory.VIPPatientFactory;
import patient.Patient;
import utils.KeyboardInput;

import java.util.HashMap;
import java.util.Map;

public class FactoryController {
    private Map<Integer, PatientFactory> factory = new HashMap<>();

    public FactoryController() {
        factory.put(1, new NormalPatientFactory());
        factory.put(2, new VIPPatientFactory());
    }

    public Patient newPatient(int type) {
        String patientID = KeyboardInput.getString("Enter patientID: ");
        String medicalRecordID = KeyboardInput.getString("Enter medical record ID: ");
        String name = KeyboardInput.getString("Enter name: ");
        String dischargedDate = KeyboardInput.getString("Enter discharged date: ");
        String hospitalizedDate = KeyboardInput.getString("Enter hospitalized date: ");
        String hospitalizationReason = KeyboardInput.getString("Enter hospitalizationReason: ");

        return factory.get(type).create(patientID, medicalRecordID, name, dischargedDate, hospitalizedDate, hospitalizationReason);
    }
}
