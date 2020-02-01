package serverless.container.model.person;

public class Person {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public String getFirstName() {
        return firstName + " - Returned";
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName + " - Returned";
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber + " - Returned";
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
