import sun.text.bidi.BidiLine;

public class Person {
    private String id, name, email, address;
    private int role;

    public Person(String id, String name, String email, String address, int role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.role = role;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.id = name;
    }
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.id = email;
    }
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.id = address;
    }

    public int getRole() {
        return this.role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
