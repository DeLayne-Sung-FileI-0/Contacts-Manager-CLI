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

        Contact[] newContacts = new Contact[4];
        newContacts [0] = new Contact("Sung","Lee","555555555");
        newContacts [1] = new Contact("DeLayne","LaBove","555555556");
        newContacts [2] = new Contact("Jeniffer","Lee","555555557");
        newContacts [3] = new Contact("Jacques","Boutte","555555558");

        System.out.println(Arrays.toString(newContacts));
        System.out.println(Arrays.toString(newContacts));


//        Path dataFile = Paths.get(directory, filename);
//        Path Files.write(Path dataFile, List<String> lines[, StandardOpenOption option])

        System.out.println("Name | Phone number \n" +
                "---------------");
        List<String> contactList = new ArrayList<>();
        for (int i = 0; i < newContacts.length; i++) {

         contactList.add(String.format("%s   %s | %s  \n",newContacts[i].firstName, newContacts[i].lastName,newContacts[i].phoneNumber));

        }

        try{
            Files.write(
                    Paths.get(directory,filename),
                    contactList,
                    StandardOpenOption.APPEND
            );
        } catch (Exception e) {
            e.printStackTrace();
        }






//      WHERE FOLDER WILL LIVE
        Path dataDirectory = Paths.get(directory);
//      WHERE FILE WILL LIVE
        Path dataFile = Paths.get(directory, filename);
//      CREATE DIRECTORY AND FILE
        createDir(dataDirectory);
        createAndCheckFile(dataFile);

    }


//      CREATED DATA DIRECTORY
    private static void createDir(Path dataDirectory) {

        if(Files.notExists(dataDirectory)) {
            try {
                Files.createDirectory(dataDirectory);
                System.out.println("If succeed!");
            } catch (IOException errorHandler) {
                System.out.println("Problems occurred when creating new DIRECTORY.");
                errorHandler.printStackTrace();

            }
        }
    }

//      CREATED CONTACTS.TXT

    private static void createAndCheckFile(Path dataFile) {


        if(Files.notExists(dataFile)) {
            try {
                Files.createFile(dataFile);
                System.out.println("This will create both Directory: data, and contacts inside of Directory \"in theory\".");
            } catch (IOException errorHandler) {
                System.out.println("Problems occurred when creating new FILE.");
                errorHandler.printStackTrace();
            }

        }
    }
}


//    public static void writeFile(Path aFile, List<String> aList){
//        try {
//            Files.write(aFile, aList);
////            Files.write(aFile, aList, StandardOpenOption.APPEND);
//        } catch (IOException e){
//            System.out.println("Problems writing in the file");
//            e.printStackTrace();
//        }
//    }



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
