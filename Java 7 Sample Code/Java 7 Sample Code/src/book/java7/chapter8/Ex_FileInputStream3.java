package book.java7.chapter8;
import java.io.*;
import static java.lang.System.out;

public class Ex_FileInputStream3 {
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

            buffer = new byte[totalBytes];
            if (fis.read(buffer) == totalBytes) {
                out.println("檔案內容 : ");
                out.println("-----------------------");
                String s = new String(buffer);
                out.println(s);
            } else {
                out.println("資料位元組總數錯誤！");
            }

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
