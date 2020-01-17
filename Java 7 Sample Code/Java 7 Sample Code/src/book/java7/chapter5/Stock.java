package book.java7.chapter5;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Stock {
    private ReadWriteLock lock = new ReentrantReadWriteLock();
    private int price;
    public Stock(int price) {
        setPrice(price);
    }
    public int getPrice() {
       try {
           lock.readLock().lock();
            return price;
        } finally {
           lock.readLock().unlock();
        }
        
    }
    public void setPrice(int price) {
        try {
            lock.writeLock().lock();
            Thread.sleep(1000);
            this.price = price;
        } 
        catch(InterruptedException e) {} 
        finally {
            lock.writeLock().unlock();
        }
    }
}
