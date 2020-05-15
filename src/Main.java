import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        //We will be building a command line application for keeping track of "contacts".
        // A contact will be comprised of a a name and phone number combination.
        //
        //The application should be able to:
        //
        //Show all your contacts
        //Add a new contact
        //Search a contact by her name
        //Delete an existing contact

        String directory = "data";
        String filename = "contacts.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        if(Files.notExists(dataDirectory)) {
            try {
                Files.creatDirectories(dataDirectory)
            }
        }


    }
}

