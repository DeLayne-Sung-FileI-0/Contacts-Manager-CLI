import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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

}
