package book.java7.chapter3;
interface Pet {
    String attr = "cute";
    void skill();
    void move();
}

public class AnonymousClass {
    public static void main(String[] args) {
        Pet p = new Pet()
                {
                    public void skill(){
                        System.out.println("我會握手 !");
                    }
                    public void move(){
                        System.out.println("我會跑步 !");
                    }
                };
        p.skill();
        p.move();
    }
}
