package book.java7.chapter5;
import lab.session4.*;
import java.util.concurrent.FutureTask;

public class FutureDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("請給我一組0~99的幸運數字 !");
        FutureTask<Integer> task = new FutureTask<>(new Lotto());
        new Thread(task).start();
        System.out.println("計算中...");
        System.out.println("您的幸運數字是:" + task.get());        
    }
}
