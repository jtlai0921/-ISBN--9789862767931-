package book.java7.chapter5;
public class ThreadTest {
    public static void main(String[] args) {
        System.out.println("HelloWorld !");
        String tName = Thread.currentThread().getName();
        System.out.println("執行緒名稱 : " + tName);
    }
}

