package book.java7.chapter3;
class MyOuter3 {
    static class MyStatic3 {
        public void fooA() { // non-static member
            System.out.println("Hello " +
                                   "static inner class A.");
        }
        public static void fooB() { // static member
            System.out.println("Hello " +
                                   "static inner class B.");
        }
    }
}

public class StaticInnerClass {
    public static void main(String[] args) {
        MyOuter3.MyStatic3 s = new MyOuter3.MyStatic3();
        s.fooA();
        s.fooB();
        MyOuter3.MyStatic3.fooB();
    }
}
