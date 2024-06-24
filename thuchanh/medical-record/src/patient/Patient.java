package patient;

public abstract class Patient {
    private String patientID;
    private String medicalRecordID;
    private String name;
    private String hospitalizedDate;
    private String dischargedDate;
    private String hospitalizationReason;

    public Patient(String patientID, String medicalRecordID, String name, String hospitalizedDate, String dischargedDate, String hospitalizationReason) {
        this.dischargedDate = dischargedDate;
        this.hospitalizationReason = hospitalizationReason;
        this.hospitalizedDate = hospitalizedDate;
        this.medicalRecordID = medicalRecordID;
        this.name = name;
        this.patientID = patientID;
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

    public String getMedicalRecordID() {
        return medicalRecordID;
    }

    public void setMedicalRecordID(String medicalRecordID) {
        this.medicalRecordID = medicalRecordID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

}
