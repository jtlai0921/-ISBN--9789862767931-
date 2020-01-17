package book.java7.chapter5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InvokeAnyDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("請給我一組0~99的Lotto數字 !");
        ExecutorService service = Executors.newCachedThreadPool();        
        Collection<Callable<Integer>> list = new ArrayList<>();
        list.add(new Lotto());
        list.add(new Lotto());
        list.add(new Lotto());
        list.add(new Lotto());
        list.add(new Lotto());
        System.out.println("計算中...");
        int result = service.invokeAny(list);
        service.shutdown();
        System.out.println("您的Lotto數字是:" + result);
    }
}
