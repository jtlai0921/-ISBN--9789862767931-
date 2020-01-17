package book.java7.chapter3;
class Father8 {
    String name = "Father";
    String getName() {
        return name;
    }
    String greeting() {
        return "class Father";
    }
}
class Son8 extends Father8 {
    String name = "Son";
    String greeting() {
        return "class Son";
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        // block of code！
    }
}
