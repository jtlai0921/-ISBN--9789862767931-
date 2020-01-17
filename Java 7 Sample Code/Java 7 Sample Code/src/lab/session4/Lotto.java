package lab.session4;

import java.util.Date;
import java.util.concurrent.Callable;

public class Lotto implements Callable<Integer> {
    @Override
    @SuppressWarnings("empty-statement")
    public Integer call() throws Exception {
        new Thread();
        for(int i=0;i<=999999999;i++);//模擬要花費的時間
        int number = (int)(Math.random() * 100);
        System.out.println("\t得到 " + number + " 的時間:" + new Date());
        return number;
    }
    
}
