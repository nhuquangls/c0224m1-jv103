package factory;

import patient.Patient;

public interface PatientFactory {
    Patient create(String patientID, String medicalRecordID, String name, String hospitalizedDate, String dischargedDate, String hospitalizationReason, String...extraInfo);
}
