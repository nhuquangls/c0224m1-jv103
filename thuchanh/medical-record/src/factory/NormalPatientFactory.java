package factory;

import patient.NormalPatient;
import patient.Patient;

public class NormalPatientFactory implements PatientFactory {
    @Override
    public Patient create(String patientID, String medicalRecordID, String name, String hospitalizedDate, String dischargedDate, String hospitalizationReason, String... extraInfo) {
        return new NormalPatient(patientID, medicalRecordID, name, hospitalizedDate, dischargedDate, hospitalizationReason, extraInfo[0]);
    }
}
