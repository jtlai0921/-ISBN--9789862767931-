package lab.session4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo1 {
    public static void main(String[] args) throws Exception {
        System.out.println("請給我五組0~99的Lotto數字 !");
        ExecutorService service = Executors.newCachedThreadPool();
        System.out.println("計算中...");
        Future<Integer> future = service.submit(new Lotto());
        int result = future.get();
        System.out.println("您的Lotto數字是:" + result);
        service.shutdown();
    }
}
