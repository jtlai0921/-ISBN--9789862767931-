package book.java7.chapter8;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.AclFileAttributeView;

public class AclFileAttributeViewDemo {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("C:/Users/desktop.ini");
        AclFileAttributeView attr = 
                Files.getFileAttributeView(path, AclFileAttributeView.class);        
        System.out.print(attr.getOwner());

    }
}
