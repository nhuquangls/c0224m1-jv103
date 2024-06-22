package entity;

public class StaffWorkshop extends Staff {
    private String workshopID;

    public StaffWorkshop() {
    }

    public StaffWorkshop(int id, String name, String phone, String role, String workshopID) {
        super(id, name, phone, role);
        this.workshopID = workshopID;
    }

    public String getWorkshopID() {
        return workshopID;
    }

    public void setWorkshopID(String workshopID) {
        this.workshopID = workshopID;
    }

    @Override
    public String toString() {
        return String.format("StaffWorkshop:\t id  = %d \t name = %s \t phone = %s \t role = %s \t workshopID = %s",
                this.getId(), this.getName(), this.getPhone(), this.getRole(), this.getWorkshopID());
    }
}
