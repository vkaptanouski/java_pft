package by.stqa.pft.addressbook;

public class ContactData {
    private final String address;
    private final String firstName;
    private final String lastName;
    private final String mobilePhone;

    public ContactData(String address, String firstName, String lastName, String mobilePhone) {
        this.address = address;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobilePhone = mobilePhone;
    }

    public String getAddress() {
        return address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }
}
