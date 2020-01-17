package book.java7.chapter3;
public class MethodInnerClass2 {
    public static void main(String[] args) {
        new MethodInnerClass().see();
    }
    void see() {
        final int fx = 7;
        int x = 77;
        class MyInner {
            void foo() {
                //System.out.println("local x = " + x);
                System.out.println("final fx = " + fx);
            }
        }
        MyInner mi = new MyInner();
        mi.foo();
    }
}
