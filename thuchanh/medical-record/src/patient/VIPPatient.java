package patient;

public class VIPPatient extends Patient {
    private String vipType;
    private String expirationDate;

    public VIPPatient(String patientID, String medicalRecordID, String name, String hospitalizedDate, String dischargedDate, String hospitalizationReason, String vipType, String expirationDate) {
        super(patientID, medicalRecordID, name, hospitalizedDate, dischargedDate, hospitalizationReason);
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
                "patientID=" + this.getPatientID() +
                ", medicalRecordID=" + this.getMedicalRecordID() +
                ", name=" + this.getName() +
                ", hospitalizedDate='" + this.getHospitalizedDate() + '\'' +
                ", dischargedDate='" + this.getDischargedDate() + '\'' +
                ", hospitalizationReason='" + this.getHospitalizationReason() + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                ", vipType='" + vipType + '\'' +
                '}';
    }
}
