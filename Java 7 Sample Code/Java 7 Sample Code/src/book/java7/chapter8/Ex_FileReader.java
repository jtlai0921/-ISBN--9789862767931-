package book.java7.chapter8; 
import java.io.*;
public class Ex_FileReader {
    public static void main(String[] args) {
        char[] buffer = new char[1]; // 一次讀一個 char
        FileReader fr = null;

        try {
            fr = new FileReader("src/book/java7/chapter8/NewFile.txt");
            System.out.println("讀取到的 SampleFile.txt 檔案內容");
            System.out.println("-----------------------------");

            while (fr.read(buffer)!= -1) {
                // 一個英文字母與一個中文字都是一個 char
                System.out.print(new String(buffer));
            }
            System.out.println();
        }
        catch (IOException e) { }
        finally {
            try {
                fr.close(); // 關閉檔案
            }
            catch (IOException e) { }
        }
    }
}
