package book.java7.chapter9;
public class AutoBoxOverload {
    public static void main(String[] args) {
        Integer i = 100;
        int j = 200;
        foo(i);
        foo(j);
    }
    static void foo(int x){
        System.out.println("int x = " + x);
    }
}

