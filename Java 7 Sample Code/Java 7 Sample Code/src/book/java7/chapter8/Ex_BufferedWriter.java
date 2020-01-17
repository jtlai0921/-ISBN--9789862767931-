package book.java7.chapter8;
import java.io.*;
public class Ex_BufferedWriter {
    public static void main(String[] args) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        String[] data = new String[2];
        data[0] = "\n1z0-803";
        data[1] = "1z0-804";
        try {
            fw = new FileWriter("src/book/java7/chapter8/NewFile.txt", true);
            bw = new BufferedWriter(fw);
            for(int i=0;i<data.length;i++) {
                bw.write(data[i]);
                bw.newLine();
            }
        }
        catch(IOException e){}
        finally {
            try {
                bw.close();
            }
            catch(IOException e) {}
        }
    }
}
