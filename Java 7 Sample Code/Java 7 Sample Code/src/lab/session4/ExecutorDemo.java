/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.session4;

import java.util.Date;
import java.util.concurrent.Executor;

class GetTimeRunnable implements Runnable {
    public void run() {
        String tName = Thread.currentThread().getName();
        System.out.println(tName + ":" + new Date());
    }
}

class MyExecutor implements Executor {
    @Override
    public void execute(Runnable r) {
        new Thread(r).start();
    }
}

public class ExecutorDemo {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(new GetTimeRunnable());
        t1.start();
        
        Executor exec = new MyExecutor();
        exec.execute(new GetTimeRunnable());
    }
}
