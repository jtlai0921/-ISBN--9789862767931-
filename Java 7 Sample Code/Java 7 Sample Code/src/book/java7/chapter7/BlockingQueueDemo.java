package book.java7.chapter7;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Put implements Runnable {
    private BlockingQueue<Integer> queue;
    Put(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }
    public void run() {
        for(int i=1;i<=10;i++) {
            try {
                queue.put(i);
                System.out.println("主人放了第 " + i + " 塊餅乾.");
            } catch(Exception e) { }
        }
    }	
}

class Eat implements Runnable {
    private BlockingQueue<Integer> queue;
    Eat(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }
    public void run() {
        for(int i=1;i<=10;i++) {
            try {
                queue.take();
                System.out.println("小白狗吃了第 " + i + " 塊餅乾.");
            } catch(Exception e) { }
        }
    }	
}

public class BlockingQueueDemo {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        Thread master = new Thread(new Put(queue));
        Thread dog = new Thread(new Eat(queue));
        dog.start();
        master.start();
    }
}
