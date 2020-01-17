package book.java7.chapter4;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
public class TryWithResources {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("src/book/java7/chapter4/Demo.txt");
            FileReader fr = new FileReader("src/book/java7/chapter4/Demo.txt")) {
            // 將"Hello Java 7"字串寫入Demo.txt
            fw.write("Hello Java 7");
            fw.flush();
            
            char[] data = new char[1];
            // 將Demo.txt的檔案內容讀出
            while(fr.read(data) != -1) {
                System.out.print(new String(data));
            }
        } catch(IOException e) {
            e.printStackTrace(System.out);
        }
    }
}
