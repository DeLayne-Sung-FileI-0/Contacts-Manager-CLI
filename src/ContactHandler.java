public class ContactHandler {

//    1. CLASS : app to handle contacts phone#, name in STRING
//              Methods (to show contact, add a contact, search a contact, delete contact)

//    properties, fields
    private String firstName;
    private String lastName;
    private String phoneNumber;

//    constructor
    public ContactHandler (String fn, String ln, String pn) {
        this.firstName = fn;
        this.lastName = ln;
        this.phoneNumber =pn;
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
}
