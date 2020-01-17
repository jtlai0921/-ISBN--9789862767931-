package book.java7.chapter3;
class Animal {
    public void move() {
        System.out.println("移動...");
    }
}
class Cat extends Animal {
    public void move() {
        System.out.println("跑跑跳跳...");
    }
    public void skill() {
        System.out.println("洗澡...");
    }
}
class Bird extends Animal {
    public void move() {
        System.out.println("飛飛飛...");
    }
}
class Tiger extends Cat {
    public void skill() {
        System.out.println("狩獵...");
    }
}
public class Zoo {
    public static void main(String[] args) {
        //進行實作
    }
}
