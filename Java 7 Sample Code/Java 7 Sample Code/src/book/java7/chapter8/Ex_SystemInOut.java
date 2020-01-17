package book.java7.chapter8; 
import java.io.*;
public class Ex_SystemInOut {
    public static void main(String[] args) {
        InputStreamReader in = null;
        BufferedReader br = null;
        PrintWriter pw = null;
        try {
            in = new InputStreamReader(System.in);
            br = new BufferedReader(in);
            pw = new PrintWriter(System.out, true);
            String s;
            while(true) {
                pw.println("請輸入任意的字串(quit離開)");
                s = br.readLine();
                if (s.equals("quit")) break;
                pw.println("\n您所輸入的字串是 = " + s);
            }
        }
        catch(IOException e) {}
        finally {
            try {
                br.close();
                pw.close();
            }
            catch(IOException e){}
        }
    }
}
