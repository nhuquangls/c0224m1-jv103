package factory;

import patient.Patient;
import patient.VIPPatient;

public class VIPPatientFactory implements PatientFactory {
    @Override
    public Patient create(String patientID, String medicalRecordID, String name, String hospitalizedDate, String dischargedDate, String hospitalizationReason, String... extraInfo) {
        return new VIPPatient(patientID, medicalRecordID, name, hospitalizedDate, dischargedDate, hospitalizationReason, extraInfo[0], extraInfo[1]);
    }
}
