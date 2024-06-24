package patient;

public class NormalPatient extends Patient {
    String inpatientCost;

    public NormalPatient(String dischargedDate, String hospitalizationReason, String hospitalizedDate, String medicalRecordID, String name, String patientID, String inpatientCost) {
        super(dischargedDate, hospitalizationReason, hospitalizedDate, medicalRecordID, name, patientID);
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
                "dischargedDate='" + this.getDischargedDate() + '\'' +
                ", patientID=" + this.getPatientID() +
                ", medicalRecordID=" + this.getMedicalRecordID() +
                ", name=" + this.getName() +
                ", hospitalizedDate='" + this.getHospitalizedDate() + '\'' +
                ", hospitalizationReason='" + this.getHospitalizationReason() + '\'' +
                ", inpatientCost=" + inpatientCost +
                '}';
    }
}
