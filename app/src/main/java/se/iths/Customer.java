package se.iths;

public class Customer {

    private long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAdress;

    public Customer() {
    }

    public Customer(long id, String firstName, String lastName, String phoneNumber, String emailAdress) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAdress = emailAdress;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    @Override
    public String toString() {
        return
                "Id=" + id +
                ", First name=" + firstName +
                ", Last name=" + lastName +
                ", Phone=" + phoneNumber +
                ", Email=" + emailAdress;
    }
}
