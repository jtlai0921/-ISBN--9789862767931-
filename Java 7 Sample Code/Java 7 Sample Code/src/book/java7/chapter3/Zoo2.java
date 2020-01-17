package book.java7.chapter3;
class Animal3 {
    public void move() {
        System.out.println("動...");
    }
}
class Cat3 extends Animal3 {
@Override
    public void move() {
        System.out.println("跳...");
    }
}
class Bird3 extends Animal3 {
@Override
    public void move() {
        System.out.println("飛...");
    }
}
class Tiger3 extends Cat3 {
@Override
    public void move() {
        System.out.println("跑... ");
    }
}
public class Zoo2 {
    
    public static void main(String[] args) {
        Animal3 animal = new Animal3();
        Cat3 cat = new Cat3();
        Bird3 bird = new Bird3();
        Tiger3 tiger = new Tiger3();
        getMove(animal);
        getMove(cat);
        getMove(bird);
        getMove(tiger);
    }
    
    public static void getMove(Animal3 animal) {
        animal.move();
    }
}