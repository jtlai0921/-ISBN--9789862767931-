package book.java7.chapter8;
import java.io.*;
public class Ex_File2 {
    public static void main(String[] args) {
        String path = "C:/Program Files/Java/jdk1.7.0_15/";
        File f1 = new File(path);
        String[] fileList = f1.list();
        for(int i=0;i<fileList.length;i++) {
            File f2 = new File(path + fileList[i]);
            if (f2.isDirectory())
                System.out.println(fileList[i] + " : 是目錄.");
            else
                System.out.println(fileList[i] + " : 是檔案.");
        }
    }
}

