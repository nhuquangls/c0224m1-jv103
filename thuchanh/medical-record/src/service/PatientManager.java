package service;

import patient.Patient;
import ultils.KeyboardInput;

import java.util.ArrayList;
import java.util.List;

public class PatientManager implements IPatientManager {
    final List<Patient> patientList = new ArrayList<>();

    @Override
    public void add(Patient patient) {
        if (patient != null) {
            patientList.add(patient);
            System.out.println("Added patient");
        }
    }

    @Override
    public void delete(Patient patient) {
        if (patient == null) {
            System.out.println("Patient not found");
            return;
        }

        patientList.removeIf(patientInList -> patientInList.getPatientID().equals(patient.getPatientID()));
        System.out.println("Removed patien");
    }

    @Override
    public void showList() {
        for (Patient patient : patientList) {
            System.out.println(patient);
        }
    }

    public Patient getPatientByID() {
        String id = KeyboardInput.getString("Enter Patient ID: ");
        for (Patient patient : patientList) {
            if (patient.getPatientID().equals(id)) {
                return patient;
            }
        }
        return null;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }
}
