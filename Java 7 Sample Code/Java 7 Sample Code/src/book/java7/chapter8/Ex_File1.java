package book.java7.chapter8;
import java.io.*;
public class Ex_File1 {
    public static void main(String[] args) {
        File f = new File("src/book/java7/chapter8/NewFile.txt");
        System.out.println("檔案是否存在？" + f.exists());

        if (!f.exists()) {
            System.out.print("利用 createNewFile() 建立新檔案，" +
                               "是否建立成功？");

            try {
                System.out.println(f.createNewFile());
            } catch (IOException e) {
                System.out.println(e);
            }

            System.out.println("檢查新建檔案是否存在？" +
                               f.exists());
        }
    }
}

