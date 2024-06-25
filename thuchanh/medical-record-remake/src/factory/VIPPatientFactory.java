package factory;

import patient.Patient;
import patient.VIPPatient;
import utils.KeyboardInput;

public class VIPPatientFactory implements PatientFactory {
    public Patient create(String patientID, String medicalRecordID, String name, String hospitalizedDate, String dischargedDate, String hospitalizationReason) {

        String vipType = "";
        int choice = KeyboardInput.getInteger("Enter vip type: 1=VIP1, 2=VIP2, 3=VIP3");
        if (choice == 1) {
            vipType = "VIP1";
        } else if (choice == 2) {
            vipType = "VIP2";
        } else if (choice == 3) {
            vipType = "VIP3";
        }
        String expirationDate = KeyboardInput.getString("Enter expiration date: ");
        return new VIPPatient(patientID, medicalRecordID, name, dischargedDate, hospitalizedDate, hospitalizationReason, vipType, expirationDate);
    }
}