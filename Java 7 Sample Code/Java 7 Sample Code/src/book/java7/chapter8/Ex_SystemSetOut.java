package book.java7.chapter8; 
import java.io.*;
public class Ex_SystemSetOut {
    public static void main(String[] args) {
        InputStreamReader in = null;
        BufferedReader br = null;
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        PrintStream out = null;
        try {
            in = new InputStreamReader(System.in);
            br = new BufferedReader(in);
            fos = new FileOutputStream("src/book/java7/chapter8/"
                    + "OutputFile.txt");
            bos = new BufferedOutputStream(fos);
            out = new PrintStream(bos, true);
            System.setOut(out);
            String s;
            while((s = br.readLine()).length() != 0) {
                if (s.equals("quit")) break;
                System.out.println("您所輸入的字串是 = " + s);
            }
            out.flush(); // 將緩衝區內容清出
        }
        catch(IOException e) {}
        finally {
            out.close(); // 關閉 Stream(記得要加)
        }
    }
}
