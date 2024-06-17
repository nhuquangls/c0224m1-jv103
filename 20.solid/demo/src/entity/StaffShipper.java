package entity;

public class StaffShipper extends Staff{
    private String car;

    public StaffShipper() {
    }

    public StaffShipper(int id, String name, String phone, String role, String car) {
        super(id, name, phone, role);
        this.car = car;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return String.format("StaffShipper:\t id  = %d \t name = %s \t phone = %s \t role = %s \t car = %s",
                this.getId(), this.getName(), this.getPhone(), this.getRole(), this.getCar());
    }
}
