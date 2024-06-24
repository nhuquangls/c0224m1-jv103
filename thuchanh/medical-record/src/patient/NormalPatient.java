package patient;

public class NormalPatient extends Patient {
    String inpatientCost;

    public NormalPatient(String patientID, String medicalRecordID, String name, String hospitalizedDate, String dischargedDate, String hospitalizationReason, String inpatientCost) {
        super(patientID, medicalRecordID, name, hospitalizedDate, dischargedDate, hospitalizationReason);
        this.inpatientCost = inpatientCost;
    }

    public String getInpatientCost() {
        return inpatientCost;
    }

    public void setInpatientCost(String inpatientCost) {
        this.inpatientCost = inpatientCost;
    }

    @Override
    public String toString() {
        return "NormalPatient{" +
                "patientID=" + this.getPatientID() +
                ", medicalRecordID=" + this.getMedicalRecordID() +
                ", name=" + this.getName() +
                ", hospitalizedDate='" + this.getHospitalizedDate() + '\'' +
                ", dischargedDate='" + this.getDischargedDate() + '\'' +
                ", hospitalizationReason='" + this.getHospitalizationReason() + '\'' +
                ", inpatientCost=" + inpatientCost +
                '}';
    }
}
