package book.java7.chapter4;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CatchingMultipleException {
    public static void main(String[] args) {
        try {
            access();
        } catch (FileNotFoundException e) {
            System.out.println(e.getClass() + ":" + e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getClass() + ":" + e.getMessage());
        } 
    }

    private static void access() throws FileNotFoundException, IOException {
        if (Math.random() < 0.5) {
            throw new FileNotFoundException("找不到檔案檔案");
        } else {
            throw new IOException("無法開啟檔案");
        }
    }
}
