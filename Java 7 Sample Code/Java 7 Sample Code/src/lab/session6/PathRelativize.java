package lab.session6;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathRelativize {
    public static void main(String[] args) {
        Path path1 = Paths.get("C:/temp/Company/Finance");
        Path path2 = Paths.get("C:/Users/Administrator/Downloads");
        Path path1ToPath2 = path1.relativize(path2);
        System.out.println(path1ToPath2);
        System.out.println(path1.toAbsolutePath());
        System.out.println(path2.toAbsolutePath());
        
    }
}
