package book.java7.chapter3;
abstract class Car {
    public void power(){
    }
    abstract void move();
}

public class Tank extends Car {
    public void move(){
        System.out.println("坦克是用履帶走的...");
    }
    public static void main(String[] args) {
        Tank t = new Tank();
        t.move();
    }
}
