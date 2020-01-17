package book.java7.chapter8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesCopyAndDelete {
    public static void main(String[] args) {
        Path source = Paths.get("C:/temp/Company/Finance/Salary.dat");
        Path dest = Paths.get("C:/temp/Company/Salary.dat");
        try {
            Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
            Files.delete(source);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }
}
