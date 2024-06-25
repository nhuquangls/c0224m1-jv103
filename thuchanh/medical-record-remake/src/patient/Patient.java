package patient;

public abstract class Patient {
    protected String patientID;
    protected String medicalRecordID;
    protected String name;
    protected String hospitalizedDate;
    protected String dischargedDate;
    protected String hospitalizationReason;

    public Patient(String patientID, String medicalRecordID, String name, String hospitalizedDate, String dischargedDate, String hospitalizationReason) {
        this.patientID = patientID;
        this.medicalRecordID = medicalRecordID;
        this.name = name;
        this.hospitalizedDate = hospitalizedDate;
        this.dischargedDate = dischargedDate;
        this.hospitalizationReason = hospitalizationReason;
    }

    public String getDischargedDate() {
        return dischargedDate;
    }

    public void setDischargedDate(String dischargedDate) {
        this.dischargedDate = dischargedDate;
    }

    public String getHospitalizationReason() {
        return hospitalizationReason;
    }

    public void setHospitalizationReason(String hospitalizationReason) {
        this.hospitalizationReason = hospitalizationReason;
    }

    public String getHospitalizedDate() {
        return hospitalizedDate;
    }

    public void setHospitalizedDate(String hospitalizedDate) {
        this.hospitalizedDate = hospitalizedDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMedicalRecordID() {
        return medicalRecordID;
    }

    public void setMedicalRecordID(String medicalRecordID) {
        this.medicalRecordID = medicalRecordID;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }
}
