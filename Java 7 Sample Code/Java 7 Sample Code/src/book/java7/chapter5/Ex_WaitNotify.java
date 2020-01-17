package book.java7.chapter5; 
import static java.lang.System.out;
public class Ex_WaitNotify {
    public static void main(String[] args) {
        One one = new One();
        one.start();
        synchronized(one) {
            String tName = Thread.currentThread().getName();
            out.print("one 進入 wait pool ");
            out.println("(" + tName + ")");
            try {

                one.wait();

            } catch (InterruptedException e) {}

            out.print("one 離開 wait pool ");
            out.println("(" + tName + ")");
        }
    }
}

class One extends Thread {
    public void run() {
        synchronized (this) {
            String tName = Thread.currentThread().getName();
            out.print("呼叫 notify() ");
            out.println("(" + tName + ")");
	
            notify();

            out.print("notify() 呼叫完畢! ");
            out.println("(" + tName + ")");
        }
    }
}
