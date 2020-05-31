public class Main{
    public static void main(String[] args) {
//        3. CLASS : to run the app
//              get the methods that we created. (to run the app with methods we created)
        FileHandler.createDirs();
        // CREATING New contacts
//      For instances they are defined inside of MAIN method (Always)
        Contact sung = new Contact("Sung Il", "Lee", "8178799506");
        Contact delayne = new Contact("DeLayne", "LaBove", "8179408605");
        Contact jenny = new Contact("Jennifer", "Lee", "2545930952");
        Contact jacques = new Contact("Jacques", "Boutte", "8178765342");

        FileHandler.writeContact(sung);
        FileHandler.writeContact(delayne);
        FileHandler.writeContact(jenny);
        FileHandler.writeContact(jacques);

        FileHandler.readFile();
        FileHandler.searchFile("DeLayne");
        FileHandler.searchFile("Jennifer");

        FileHandler.deleteContact("8178799506");
        FileHandler.readFile();
    }
}


// classes : 1. CLASS : app to handle contacts
//              Methods (to show contact, add a contact, search a contact, delete contact)
//           2. CLASS : file handling
//              Methods (to create directory, file, write, and readFile)
//           3. CLASS : to run the app
//              get the methods that we created. (to run the app with methods we created)