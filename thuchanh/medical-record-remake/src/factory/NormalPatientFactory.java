package factory;

import patient.NormalPatient;
import patient.Patient;
import utils.KeyboardInput;

public class NormalPatientFactory implements PatientFactory {
    @Override
    public Patient create(String patientID, String medicalRecordID, String name, String hospitalizedDate, String dischargedDate, String hospitalizationReason) {
        String inpatientCost = KeyboardInput.getString("Enter inpatient cost: ");
        return new NormalPatient(patientID, medicalRecordID, name, hospitalizedDate, dischargedDate, hospitalizationReason, inpatientCost);
    }
}
