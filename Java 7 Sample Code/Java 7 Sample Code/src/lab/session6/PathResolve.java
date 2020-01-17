package lab.session6;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathResolve {
    public static void main(String[] args) {
        Path path1 = Paths.get("C:/temp");
        Path path2 = Paths.get("Company/Finance");
        Path path3 = path1.resolve(path2);
        System.out.println(path3); // C:\temp\Company\Finance
        Path path = Paths.get("C:\\temp\\Company\\Finance\\Salary.dat");
        Path root = Paths.get("C:\\temp");
        Path file = Paths.get("Salary.dat");
        System.out.println(path.startsWith(root));
        System.out.println(path.endsWith(file));
        
    }
}
