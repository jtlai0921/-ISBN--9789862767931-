package book.java7.chapter7;

class Life<T> {
    private T val;
    public Life(T val) {
        this.val = val;
    }
    void printVal(Life life) {
        System.out.println(life.val);
    }
}

public class LifeTest {
    public static void main(String[] args) {
        Life<? extends Number> life = new Life<>(42);
        life.printVal(life);
    }
}
