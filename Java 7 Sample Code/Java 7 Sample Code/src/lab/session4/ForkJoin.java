package lab.session4;

import java.util.Date;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class Fibonacci {    
    public int fibonacci(int num) {
        if(num == 0 || num == 1) {
            return num;
        }
        else {
            return (fibonacci(num - 1) + fibonacci(num - 2));
        }
    }
}

class FibonacciTask extends RecursiveTask<Integer> {
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

public class ForkJoin {
    public static void main(String[] args) {
        int num = 40;
        long t1 = new Date().getTime();
        System.out.println(new Fibonacci().fibonacci(num));
        long t2 = new Date().getTime();
        System.out.println("花費時間:" + (t2 - t1));
        
        long t3 = new Date().getTime();
        int processors = Runtime.getRuntime().availableProcessors();
        FibonacciTask task = new FibonacciTask(num);
        ForkJoinPool pool = new ForkJoinPool(processors);
        pool.invoke(task);
        System.out.println("Processors:" + processors + ", Result:" + task.getResult());
        long t4 = new Date().getTime();
        System.out.println("花費時間:" + (t4 - t3));
    }
}
