package book.java7.chapter3;
class MyOuter2 {
  private static int sx = 9;
  private int x = 7;
  class MyInner2 {
    private int x = 77;
    public void foo() {
      int x = 777;
      System.out.println("Local x = " + x);
      System.out.println("MyInner's x = " + this.x);
      System.out.println("MyOuter's x = " + MyOuter2.this.x);
      System.out.println("MyOuter's sx = " + MyOuter2.sx);
    }
  }
}
public class RegularInnerClass2 {
    public static void main(String[] args) {
        new MyOuter2().new MyInner2().foo();
    }
}
