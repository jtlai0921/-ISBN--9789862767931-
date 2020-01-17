package book.java7.chapter3;
class Father {
    void amethod(){
        System.out.println("呼叫父類別的 amethod！");
    }
}
public class Son extends Father {
    public static void main(String[] args) {
        Son s = new Son();
        s.amethod();
    }
    @Override
    void amethod(){
        System.out.println("呼叫子類別的 amethod！");
    }
}