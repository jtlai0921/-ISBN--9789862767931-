package book.java7.chapter3;
class MyOuter {
    class MyInner {
        public void foo() {
            System.out.println("Hello MyInner class !");
        }
    }
}
public class RegularInnerClass {

    public static void main(String[] args) {
        MyOuter ou = new MyOuter();
        MyOuter.MyInner in = ou.new MyInner();
        in.foo();
    }
}
