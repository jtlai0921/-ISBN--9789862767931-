package book.java7.chapter8; 
import java.io.*;
public class AddIntReadBean {
    public static void main(String[] args) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        AddInt ai = null;
        String path = "src/book/java7/chapter8/IntBean.ser";
        try {
            fis = new FileInputStream(path);
            ois = new ObjectInputStream(fis);
            ai = (AddInt) ois.readObject();

            if (ai != null)
                System.out.println(ai.getSum());
            else
                System.out.println("null");

        }
        catch (IOException e) { }
        catch (ClassNotFoundException e) { }
        finally {
            try {
                ois.close();
                fis.close();
            }
            catch(IOException e) {}
        }
    }
}
