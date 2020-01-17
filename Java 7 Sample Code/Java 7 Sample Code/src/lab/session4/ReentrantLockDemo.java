package lab.session4;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class Stock {
    //private Lock lock = new ReentrantLock();
    private ReadWriteLock lock = new ReentrantReadWriteLock();
    private int price;
    Stock(int price) {
        setPrice(price);
    }
    public int getPrice() {
       try {
            //lock.lock();
           lock.readLock().lock();
            System.out.println("get");
            return price;
        } finally {
            //lock.unlock();
           lock.readLock().unlock();
        }
        
    }
    public void setPrice(int price) {
        try {
            //lock.lock();
            lock.writeLock().lock();
            Thread.sleep(1000);
            this.price = price;
            System.out.println("update");
        } 
        catch(InterruptedException e) {} 
        finally {
            //lock.unlock();
            lock.writeLock().unlock();
        }
        
    }
}
public class ReentrantLockDemo {
    
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
