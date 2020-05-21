import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String directory = "data";
        String filename = "contacts.txt";
        List<String> contactList = new ArrayList<>();

//        Contact newPerson = new Contact("Tandy", "Mitchell", "5555555555");
        Contact[] newContacts = new Contact[4];
        newContacts[0] = new Contact("Sung", "Lee", "555555555");
        newContacts[1] = new Contact("DeLayne", "LaBove", "555555556");
        newContacts[2] = new Contact("Jeniffer", "Lee", "555555557");
        newContacts[3] = new Contact("Jacques", "Boutte", "555555558");
        System.out.println(Arrays.toString(newContacts));
        System.out.println(Arrays.toString(newContacts));


        System.out.println("Name | Phone number \n" +
                "------------------");

        for (int i = 0; i < newContacts.length; i++) {

            contactList.add(String.format("%s   %s | %s ", newContacts[i].firstName, newContacts[i].lastName, newContacts[i].phoneNumber));

        }

        try {
            Files.write(
                    Paths.get(directory, filename),
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
//        getContactList(dataFile,true);

        readFile(dataFile, true);
        addNewContact(sc);
        fileContains(sc, dataFile);
//        fileContains(dataFile);


    }

    //      CREATED DATA DIRECTORY
    private static void createDir(Path dataDirectory) {

        if (Files.notExists(dataDirectory)) {
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


        if (Files.notExists(dataFile)) {
            try {
                Files.createFile(dataFile);
                System.out.println("This will create both Directory: data, and contacts inside of Directory \"in theory\".");
            } catch (IOException errorHandler) {
                System.out.println("Problems occurred when creating new FILE.");
                errorHandler.printStackTrace();
            }

        }
    }


    // todo View contacts Load all of the contacts by calling a method that returns a List of Contact objects.


    public static void addNewContact(Scanner sc) {
        try {
            System.out.println("Add new contact");
            String userInput = sc.nextLine();
            System.out.println("userInput = " + userInput);
            Files.write(
                    Paths.get("data", "contacts.txt"),
                    Arrays.asList(userInput),
                    StandardOpenOption.APPEND
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //      PRINT CONTACT LIST
    public static List<String> readFile(Path aFile, boolean print) {
        List<String> lines;
        try {
            lines = Files.readAllLines(aFile);
            if (print == true) {
                System.out.println("Name | Phone number \n" +
                        "---------------");
                for (String line : lines) {
                    System.out.println(line);
                }
                return null;
            }
            return lines;
        } catch (IOException e) {
            System.out.println("Problems reading the file");
            e.printStackTrace();
            return null;
        }
    }


    //          SEARCH LIST

    // todo method search by contact name #3
    public static List<String> fileContains(Scanner sc,  Path aFile) {
        System.out.println("Who do you want to find?");
        String userInput = sc.nextLine();
        List<String> lines = readFile(aFile, false);
        for (String line : lines) {
            if (line.equals(userInput)) {
                return lines;
            }
//        return false;
        }
        return null;
    }

    // todo method to delete existing contact #4
    public static void deleteExistingContact(String contact) {
        // I feel like if we can figure out the "fileContains" method,
        // we can use that method grab that contact and .remove()
        // return updatedContactLists

        // todo figure out fileContains (for:each) , and make updated-contactLists
    }





//
//    private static boolean fileContains(Scanner sc, Path aFile) {
//        String userSearch = sc.nextLine();
//        List<String> lines = readFile(aFile, false);
//        for (String line : lines) {
//            if(line.equals(userSearch)){
//                System.out.println("Worked!!");
//                return true;
//            }
//        }
//        System.out.println("WHOOOOOOMP");
//        return false;
//    }
//
//    public static String fileContains(Scanner sc, Path aFile) {
//        System.out.println("Who do you want to find?");
//        String userInput = sc.nextLine();
//        System.out.println("userInput = " + userInput);
//        List<String> lines = readFile(aFile, false);
//        System.out.println("lines = " + lines);
//        for (String line : lines) {
//            System.out.println("TEST");
//            if(line.equals(userInput)){
//                System.out.println("userInput = " + userInput);
//            } else {
//                System.out.println("Plz try again");
//            }
//        }
//        System.out.println(userInput);
//        return userInput + "DID NOT WORK";
//    }

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
    // todo if(userInput==#) continue/break;

            // method that returns a List of Contact objects in a table format #1
            // method add contact -display name and phone number in a table #2
            // todo method search by contact name #3
            // todo method to delete existing contact #4
            // todo method exit application #5

    // todo rewrite contents of contacts.txt using List of Contact Objects


 */
