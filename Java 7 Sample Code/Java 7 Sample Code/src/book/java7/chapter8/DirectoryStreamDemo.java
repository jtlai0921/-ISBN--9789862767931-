package book.java7.chapter8;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamDemo {

    public static void main(String[] args) {
        Path dir = Paths.get("C:/temp/Company");
        try (DirectoryStream<Path> stream = 
                Files.newDirectoryStream(dir, "*.{java,htm,dat}")) {            
            for (Path entry : stream) {
                System.out.println(entry.getFileName());
            }
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        }
    }
}
