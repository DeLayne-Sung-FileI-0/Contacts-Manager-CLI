import java.io.File;


//OUR 'MAIN' FILE TO RUN APP

public class ContactApp {
    public static void main(String[] args) {
//        FileIO.createDirs();
//
//        // CREATING New contacts
//        Contact sung = new Contact("Sung Il", "Lee", "8178799506");
//        Contact delayne = new Contact("DeLayne", "LaBove", "8179408605");
//        Contact jenny = new Contact("Jennifer", "Lee", "2545930952");
//        Contact jacques = new Contact("Jacques", "Boutte", "8178765342");
//
//        FileIO.writeContactToFile(sung);
//        FileIO.writeContactToFile(delayne);
//        FileIO.writeContactToFile(jenny);
//        FileIO.writeContactToFile(jacques);
//
//        FileIO.readFile();
//        FileIO.search("Sung");
//        FileIO.search("Jacques");

//        FileIO.delete("2545930952");
//        FileIO.delete("8179408605");


        Input input = new Input();

        while(true) {
            System.out.println("1. View contacts.\n" +
                    "2. Add a new contact.\n" +
                    "3. Search a contact by name.\n" +
                    "4. Delete an existing contact.\n" +
                    "5. Exit.\n" +
                    "Enter an option (1, 2, 3, 4 or 5):");
            int option = input.getInt(1,5);
            switch (option) {
                case 1:
                    FileIO.readFile();
                    break;
                case 2:
                    String firstName = input.getString("Give me the First Name");
                    String lastName = input.getString("Give me the Last Name");
                    String phoneNum = input.getString("Give me the Phone Number");
                    Contact contact = new Contact(firstName, lastName, phoneNum);
                    FileIO.writeContactToFile(contact);
                    break;
                case 3:
                    String term = input.getString("Give me the name to search");
                    FileIO.search(term);
                    break;
                case 4:
                    String aNumber = input.getString("Give me the phone number to delete");
                    FileIO.delete(aNumber);
                    break;
                case 5:
                    System.exit(0);

            }
        }

    }
}

// todo Note: This class will have main methods for running methods