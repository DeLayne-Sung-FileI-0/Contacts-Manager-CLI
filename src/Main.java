import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String directory = "data";
        String filename = "contacts.txt";

        ArrayList<String> contactNameList = new ArrayList<>();
        Path filepath = Paths.get("data", "contacts.txt");
        try {
            System.out.println("Contacts Written!");
            Files.write(filepath, contactNameList);

        } catch (Exception e) {
            System.out.println("Learn more and try again!");
        }

        Contacts[] newContacts = new Contacts[4];
        newContacts [0] = new Contacts ("Sung","Lee","555555555");
        newContacts [1] = new Contacts ("DeLayne","LaBove","555555556");
        newContacts [2] = new Contacts ("Jeniffer","Lee","555555557");
        newContacts [3] = new Contacts ("Jacques","Boutte","555555558");




// CREATED DATA DIRECTORY AND CONTACTS.TXT DIRECTORY FOR CONTACT LIST
        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);



        if(Files.notExists(dataDirectory)) {
            try {
                Files.createDirectory(dataDirectory);
            } catch (IOException errorHandler) {
                System.out.println("Problems occurred when creating new DIRECTORY.");
                errorHandler.printStackTrace();
            }
        }

        if(Files.notExists(dataFile)) {
            try {
                Files.createFile(dataFile);
            } catch (IOException errorHandler) {
                System.out.println("Problems occurred when creating new FILE.");
                errorHandler.printStackTrace();
            }
        }

        System.out.println("If succeed!");
        System.out.println("This will create both Directory: data, and contacts inside of Directory \"in theory\".");

    }
}

/*
The user interface for your application should include a main menu like the following,
where the user will need to enter a number between 1 and 5:
1. View contacts.
2. Add a new contact.
3. Search a contact by name.
4. Delete an existing contact.
5. Exit.
Enter an option (1, 2, 3, 4 or 5):

    // Build contacts list
    // todo method call APPLICATION
    // todo method shows the user main menu and returns their choice of action
        // todo method that performs above action (modifying contents of the List of Contact objects)
    // todo method that returns a List of Contact objects in a table format.
    // todo method add contact -display name and phone number in a table
    // todo method search by contact name
    // todo method to delete existing contact
    // todo method exit application
    // todo rewrite contents of contacts.txt using List of Contact Objects


 */
