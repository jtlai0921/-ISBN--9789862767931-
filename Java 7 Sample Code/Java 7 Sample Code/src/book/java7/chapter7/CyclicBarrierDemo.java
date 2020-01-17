package book.java7.chapter7;
import java.util.Date;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {
    public void appointment() {
        final CyclicBarrier barrier = new CyclicBarrier(2);
        new Thread() {
            @Override
            public void run() {
                try {
                    System.out.println("男生到了:" + new Date());
                    barrier.await();                    
                    System.out.println("男生說:我們一起去吃飯吧!:" + new Date());
                } catch(Exception e) {
                
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    System.out.println("女生到了:" + new Date());
                    barrier.await();  
                } catch(Exception e) {
                
                }
            }
        }.start();
    }
    public static void main(String[] args) {
        new CyclicBarrierDemo().appointment();
    }
}
