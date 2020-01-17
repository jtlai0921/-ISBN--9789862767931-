package book.java7.chapter5; 
public class Deadlock {
  public static void main(String[] args) {
    final Object resource1 = "resource1";
    final Object resource2 = "resource2";
    Thread t1 = new Thread() {
      public void run() {
        synchronized(resource1) {
          System.out.println("T1 : locked resource 1");
          try {Thread.sleep(150);}
          catch(InterruptedException e) {}
          synchronized(resource2) {
            System.out.println("T1 : locked resource 2");
          }
        }
      }
    };

    Thread t2 = new Thread() {
      public void run() {
        synchronized(resource2) {
          System.out.println("T2 : locked resource 2");
          try {Thread.sleep(50);}
          catch(InterruptedException e) {}
          synchronized(resource1) {
            System.out.println("T2 : locked resource 1");
          }
        }
      }
    };
    t1.start();
    t2.start();
  }
}
