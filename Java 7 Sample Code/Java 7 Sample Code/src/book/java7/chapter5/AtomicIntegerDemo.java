package book.java7.chapter5;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerDemo extends Thread {
    AtomicInteger num = new AtomicInteger();
    @Override
    public void run() {
        num.incrementAndGet();
        System.out.println(num.get());
    }
    public static void main(String[] args) {
        AtomicIntegerDemo ai = new AtomicIntegerDemo();
        ai.start();        
    }
}
