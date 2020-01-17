package book.java7.chapter5;
import java.util.Date;
import java.util.concurrent.ForkJoinPool;

public class ForkJoinDemo {
    public static void main(String[] args) {
        int num = 40;
        //遞迴求解
        long t1 = new Date().getTime();
        System.out.print(new Fibonacci().fibonacci(num) + "，");
        long t2 = new Date().getTime();
        System.out.println("花費時間:" + (t2 - t1));
        //ForkJoin
        long t3 = new Date().getTime();
        int processors = Runtime.getRuntime().availableProcessors();
        FibonacciTask task = new FibonacciTask(num);
        ForkJoinPool pool = new ForkJoinPool(processors);
        pool.invoke(task);
        System.out.print(task.getResult() + "，");
        long t4 = new Date().getTime();
        System.out.print("花費時間:" + (t4 - t3) + "，");
        System.out.println("Processors:" + processors);
    }
}
