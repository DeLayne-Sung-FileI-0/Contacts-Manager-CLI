import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.nio.file.Files.readAllLines;

public class FileIO {

    private final static String directory = "redoData";
    private final static String filename = "redoContacts.txt";

    private final static Path redodataDirectory = Paths.get(directory);
    private final static Path redoDatafile = Paths.get(directory, filename);

    // Since it is STATIC, void I have changed everything to static in the class.
    static void createDirs() {
        try{
            if (Files.notExists(redodataDirectory)) {
                Files.createDirectories(redodataDirectory);
            }

            if (! Files.exists(redoDatafile)) {
                Files.createFile(redoDatafile);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    this function handles getting the data converted over into how to write it into a file

    static void writeContactToFile(Contact contact) {
        String contactLine = String.format("%s %s | %s", contact.getFirstName(), contact.getLastName(), contact.getPhoneNumber());
        System.out.println("contactLine = " + contactLine);
        // todo THIS WILL ADD context inside of .txt file
        try {
            Files.write(
                    //Paths.get("data", "groceries.txt"), SINCE WE ALREADY HAVE private final static Path redodataDatafile = Paths.get(directory, filename);
                    redoDatafile,
                    Arrays.asList(contactLine), // list with one item
                    StandardOpenOption.APPEND
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // todo readFile method will print the contact list in the console
//    static void readFile() {
//        System.out.println("Name | Phone number\n" +
//                "--------------------");
//        try {
//            List<String> lines =  Files.readAllLines(redoDatafile);
//            for (String line : lines) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    // todo searchContact
    static void search(String term) {
        try {
            List<String> lines =  Files.readAllLines(redoDatafile);
            for (String line : lines) {
                if (line.toLowerCase().startsWith(term.toLowerCase())) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // todo DELETING
    static void delete(String phoneNumber) {
        try {
            List<String> lines =  readAllLines(redoDatafile);
            List<String> writeLines = new ArrayList<>();
            for (String line : lines) {
                        // ENDSWITH for X tra careful
                if (!line.endsWith(phoneNumber)) {
                    writeLines.add(line);
//                    System.out.println(line);
//                    lines.remove(line);
                }
            }
            // after remove the line, re create the file
            Files.write(
                    redoDatafile,
                    writeLines
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

// todo NOTE: This class will make sure NEVER written so make it private final