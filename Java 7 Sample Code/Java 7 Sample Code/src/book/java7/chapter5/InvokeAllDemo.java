package book.java7.chapter5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InvokeAllDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("請給我五組0~99的Lotto數字 !");
        ExecutorService service = Executors.newCachedThreadPool();
        Collection<Callable<Integer>> list = new ArrayList<>();
        list.add(new Lotto());
        list.add(new Lotto());
        list.add(new Lotto());
        list.add(new Lotto());
        list.add(new Lotto());
        System.out.println("計算中...");
        List<Future<Integer>> resultList = service.invokeAll(list);
        System.out.print("您的Lotto數字是:");
        for(Future future : resultList) {
            System.out.print(future.get() + " ");
        }
        service.shutdown();
    }
}