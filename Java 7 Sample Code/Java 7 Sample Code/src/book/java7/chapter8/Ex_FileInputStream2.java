package book.java7.chapter8;
import java.io.*;
import static java.lang.System.out;

public class Ex_FileInputStream2 {
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

            // 中文字佔 2 個 byte
            buffer = new byte[2];
            out.println("檔案內容 : ");
            out.println("-----------------------");
            while(fis.read(buffer) == 2) {
                String s = new String(buffer);
                out.print(s);
            }

            if (totalBytes % 2 != 0) {
                String s = new String(buffer, 0, 1);
                out.print(s);
            }

            out.println();
        }
        catch (IOException e) {}
        finally {
            try {
                fis.close();
            } catch (IOException e) {
            }
        }
    }
}
