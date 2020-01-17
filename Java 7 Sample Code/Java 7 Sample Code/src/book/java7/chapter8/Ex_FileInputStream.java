package book.java7.chapter8;
import java.io.*;
import static java.lang.System.out;

public class Ex_FileInputStream {
    public static void main(String[] args) {
        byte[] buffer; // 資料緩衝區
        int totalBytes;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/book/java7/chapter8/NewFile.txt");
            //SampleFile.txt 位元總數
            totalBytes = fis.available();
            out.println("顯示可讀取資料位元組總數：" +
                            totalBytes + " bytes.");
            buffer = new byte[1];
            out.println("檔案內容 : ");
            out.println("-----------------------");
            while(fis.read(buffer) != -1) {
                out.print((char)buffer[0]);
            }
        }
        catch (IOException e) {}
        finally {
            try {
                fis.close(); // 關閉檔案
            } catch (IOException e) {
            }
        }
    }
}

