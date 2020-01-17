package book.java7.chapter8; 
import java.io.*;
public class Ex_BufferedReader {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("src/book/java7/chapter8/NewFile.txt");
            br = new BufferedReader(fr);
            String data;
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }
        }
        catch(IOException e) {}
        finally {
            try {
                br.close();
            }
            catch(IOException e) {}
        }
    }
}
