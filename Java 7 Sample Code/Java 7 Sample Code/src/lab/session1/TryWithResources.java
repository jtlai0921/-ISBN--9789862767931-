package lab.session1;
import java.io.*;
public class TryWithResources {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("src/lab/session1/Demo.txt");
            FileReader fr = new FileReader("src/lab/session1/Demo.txt")) {
            
            fw.write("Hello Java 7");
            fw.flush();
            
            char[] data = new char[1];
            while(fr.read(data) != -1) {
                System.out.print(new String(data));
            }
        } catch(IOException e) {
            e.printStackTrace(System.out);
        }
    }
}
