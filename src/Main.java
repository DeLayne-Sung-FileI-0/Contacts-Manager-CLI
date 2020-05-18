import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String directory = "data";
        String filename = "contacts.txt";

        Contact[] newContacts = new Contact[4];
        newContacts [0] = new Contact("Sung","Lee","555555555");
        newContacts [1] = new Contact("DeLayne","LaBove","555555556");
        newContacts [2] = new Contact("Jeniffer","Lee","555555557");
        newContacts [3] = new Contact("Jacques","Boutte","555555558");

        for (int i = 0; i < newContacts.length; i++) {
            System.out.printf("Name       |  Phone number |\n"+
                              "-----------|-----------|\n"+
                              "%s   %s    | %s            |\n",
                    newContacts[i].firstName, newContacts[i].lastName,newContacts[i].phoneNumber) ;
        }
//        System.out.println("Contact name: " + newContacts[i].firstName + " " + newContacts[i].lastName + " | " +"Phone Number: " + newContacts[i].phoneNumber);


//        try{
//            Files.write(
//                    Paths.get(directory,filename),
//                    Arrays.asList("test"),
//                    StandardOpenOption.APPEND
//            );
//        } catch (Exception e) {
//            e.printStackTrace();
//        }






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
        runApplication();

    // todo method shows the user main menu and returns their choice of action
        // todo method that performs above action (modifying contents of the List of Contact objects)

    //todo do-while loop
    //todo if(userInput==#) continue/break;
            // todo method that returns a List of Contact objects in a table format #1
            // todo method add contact -display name and phone number in a table #2
            // todo method search by contact name #3
            // todo method to delete existing contact #4
            // todo method exit application #5

    // todo rewrite contents of contacts.txt using List of Contact Objects


 */
