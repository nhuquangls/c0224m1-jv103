package entity;

public class StaffOffice extends Staff {
    public StaffOffice() {
    }

    public StaffOffice(int id, String name, String phone, String role) {
        super(id, name, phone, role);
    }

    @Override
    public String toString() {
        return String.format("StaffOffice:\t id  = %d \t name = %s \t phone = %s \t role = %s",
                this.getId(), this.getName(), this.getPhone(), this.getRole());
    }
}
