package book.java7.chapter3;
public class MyTest {
    MyTest() {
        System.out.println("執行 MyTest() 建構子");
    }
    public static void main(String[] args) {
        MyTest t = new MyTest();
        new MyTest();
    }
}
