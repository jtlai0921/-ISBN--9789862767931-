package book.java7.chapter5;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ThreadScheduledExecutorDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("請給我一組0~99的Lotto數字 !");
        ScheduledExecutorService exec = null;
        exec = Executors.newSingleThreadScheduledExecutor();
        System.out.println("停一秒後開始排程..." + new Date());
        ScheduledFuture<Integer> future = exec.schedule(new Lotto(), 1000, TimeUnit.MILLISECONDS);
        System.out.println("計算中...");
        int result = future.get();
        System.out.println("您的Lotto數字是:" + result);
        exec.shutdown();
    }
}