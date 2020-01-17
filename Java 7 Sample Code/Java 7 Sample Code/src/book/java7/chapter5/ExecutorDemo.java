package book.java7.chapter5;
import java.util.concurrent.Executor;

class MyExecutor implements Executor {
    @Override
    public void execute(Runnable r) {
        new Thread(r).start();
    }
}

public class ExecutorDemo {
    public static void main(String[] args) throws Exception {
        Executor exec = new MyExecutor();
        exec.execute(new GetTimeRunnable());
        exec.execute(new GetTimeRunnable());
        exec.execute(new GetTimeRunnable());
    }
}
