package book.java7.chapter8;
import java.io.*;
public class Ex_FileOutputStream {
    public static void main(String[] args) {
        String s = "Java 輸入與輸出 ( java.io 函式庫 )";
        byte[] data = s.getBytes();
        System.out.println("將字串\" " + s + " \"寫到檔案");
        System.out.println("資料長度：" +
                                data.length + " bytes.");

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("src/book/java7/chapter8/NewFile2.txt", true);
            fos.write(data); //直接將 byte[] 寫入檔案
        }
        catch(IOException e){}
        finally {
            try {
                fos.close(); // 關閉檔案
            }
            catch(IOException e){}
        }
    }
}
