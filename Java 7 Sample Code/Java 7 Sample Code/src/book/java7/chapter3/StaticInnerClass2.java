package book.java7.chapter3;
class MyOuter4 {
    private int x = 7;
    static private int sx = 9;
    static class MyStatic4 {
        private int x = 77;
        static private int sx = 99;
        public void fooA() {  // non-static method
            System.out.println(sx);
            System.out.println(MyOuter4.sx);
            System.out.println(x);
            System.out.println(this.x);
            // static inner class 中沒有 MyOuter4 的 this 指標
            //System.out.println(MyOuter4.this.x);  
        }
        public static void fooB() {  // static method
            System.out.println(sx);
            System.out.println(MyOuter4.sx);
        }
    }
}
public class StaticInnerClass2 {
    public static void main(String[] args) {
        MyOuter4.MyStatic4 s = new MyOuter4.MyStatic4();
        s.fooA(); 
        s.fooB();
    }
}
