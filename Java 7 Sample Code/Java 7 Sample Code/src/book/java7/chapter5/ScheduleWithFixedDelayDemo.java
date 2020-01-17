package book.java7.chapter5;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleWithFixedDelayDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("請給我0~99的Lotto數字 !");
        ScheduledExecutorService exec = null;
        exec = Executors.newSingleThreadScheduledExecutor();
        System.out.println("停一秒後開始排程..." + new Date());
        //exec.scheduleWithFixedDelay(new Lotto2(), 1000, 1000, TimeUnit.MILLISECONDS);
        exec.scheduleAtFixedRate(new Lotto2(), 1000, 1000, TimeUnit.MILLISECONDS);
        System.out.println("計算中...");
    }
}
