package book.java7.chapter5;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExecutorDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("請給我五組0~99的Lotto數字 !");
        ThreadPoolExecutor exec = null;
        exec = (ThreadPoolExecutor)Executors.newCachedThreadPool();
        //exec = (ThreadPoolExecutor)Executors.newFixedThreadPool(2);        
        System.out.println("計算中...");
        Future<Integer> future = exec.submit(new Lotto());
        int result = future.get();
        System.out.println("您的Lotto數字是:" + result);
        exec.shutdown();
    }
}
