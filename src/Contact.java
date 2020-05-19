public class Contact {
    public String firstName;
    public String lastName;
    public String phoneNumber;

    // Constructor Created
    public Contact(String fn, String ln, String pn){
        this.firstName = fn;
        this.lastName = ln;
        this.phoneNumber = pn;
    }
    public String getName(){
        return this.firstName;
    }
//
//    public String getLastName(){
//        return this.lastName;
//    }

}
