package book.java7.chapter5;
public class HelloThread extends Thread {
    public void run() {
        for(int i=1;i<=1000;i++) {
            String tName = Thread.currentThread().getName();
            System.out.println(tName + " : " + i);
        }
    }
}

