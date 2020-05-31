import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.nio.file.Files.readAllLines;

public class FileHandler {
    //           2. CLASS : file handling
    //              Methods (to create directory, file, write, and readFile)

    private final static String directory = "data";
    private final static String filename = "contacts.txt";

    private final static Path dataDirectory = Paths.get(directory);
    private final static Path dataFile = Paths.get(directory, filename);

    static void createDirs() {
        try{
            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
            }

            if (! Files.exists(dataFile)) {
                Files.createFile(dataFile);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void writeContact(Contact contact) {
        String contactLine = String.format("%s %s | %s", contact.getFirstName(), contact.getLastName(), contact.getPhoneNumber());
        System.out.println(contactLine);
        // todo THIS WILL ADD context inside of .txt file
        try {
            Files.write(
                    dataFile,
                    Arrays.asList(contactLine),
                    StandardOpenOption.APPEND
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void readFile() {
        System.out.println("Name | Phone number\n" +
                "--------------------");
        try {
            List<String> lines =  readAllLines(dataFile);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void searchFile(String term) {
        try {
            List<String> lines =  readAllLines(dataFile);
            for (String line : lines) {
                if (line.toLowerCase().startsWith(term.toLowerCase())) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void deleteContact(String phoneNumber) {
        try {
            List<String> lines =  readAllLines(dataFile);
            List<String> writeLines = new ArrayList<>();
            for (String line : lines) {
                // ENDSWITH for X tra careful
                if (!line.endsWith(phoneNumber)) {
                    writeLines.add(line);
                }
            }
            // after remove the line, re create the file
            Files.write(
                    dataFile,
                    writeLines
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
