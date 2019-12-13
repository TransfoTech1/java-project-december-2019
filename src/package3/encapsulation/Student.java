package package3.encapsulation;

public class Student {

    // encapsulation -- data hiding -- generate setter/getter

    private String firstName;
    private String lastName;
    private int id;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstNameForSetter) {
        this.firstName = firstNameForSetter;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
