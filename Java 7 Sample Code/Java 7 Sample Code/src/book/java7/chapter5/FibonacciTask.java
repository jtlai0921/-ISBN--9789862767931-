package book.java7.chapter5;
import java.util.concurrent.RecursiveTask;

public class FibonacciTask extends RecursiveTask<Integer> {
    private int num = 0;
    private int result = 0;
    FibonacciTask(int num) {
        this.num = num;
    }
    public int getResult() {
        return result;
    }
    @Override
    protected Integer compute() {
        if(num < 29) {
            // 小於29就直接利用單執行緒遞迴求解
            result = new Fibonacci().fibonacci(num);
        } else {
            FibonacciTask task1 = new FibonacciTask(num - 1);
            task1.fork();
            FibonacciTask task2 = new FibonacciTask(num - 2);
            result = task2.compute() + task1.join();
        }
        return result;
    }
}
