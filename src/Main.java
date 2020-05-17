import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        String directory = "data";
        String filename = "contacts.txt";

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
                Files.createDirectory(dataFile);
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

// todo method call APPLICATION
// todo method that returns a List of Contact objects.
//

 */
