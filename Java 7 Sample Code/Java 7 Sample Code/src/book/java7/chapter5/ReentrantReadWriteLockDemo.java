package book.java7.chapter5;
public class ReentrantReadWriteLockDemo {

    public static void main(String[] args) {
        final Stock stock = new Stock(100);
        Thread t1 = new Thread() {
            @Override
            public void run() {
                stock.setPrice(200);
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                System.out.println(stock.getPrice());
            }
        };
        t1.start();
        t2.start();
    }
}
