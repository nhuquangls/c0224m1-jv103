package patient;

public class VIPPatient extends Patient {
    private String vipType;
    private String expirationDate;

    public VIPPatient(String dischargedDate, String hospitalizationReason, String hospitalizedDate, String medicalRecordID, String name, String patientID, String expirationDate, String vipType) {
        super(dischargedDate, hospitalizationReason, hospitalizedDate, medicalRecordID, name, patientID);
        this.expirationDate = expirationDate;
        this.vipType = vipType;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getVipType() {
        return vipType;
    }

    public void setVipType(String vipType) {
        this.vipType = vipType;
    }

    @Override
    public String toString() {
        return "VIPPatient{" +
                "dischargedDate='" + this.getDischargedDate() + '\'' +
                ", patientID=" + this.getPatientID() +
                ", medicalRecordID=" + this.getMedicalRecordID() +
                ", name=" + this.getName() +
                ", hospitalizedDate='" + this.getHospitalizedDate() + '\'' +
                ", hospitalizationReason='" + this.getHospitalizedDate() + '\'' +
                ",expirationDate='" + expirationDate + '\'' +
                ", vipType='" + vipType + '\'' +
                '}';
    }
}
