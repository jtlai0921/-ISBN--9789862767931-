package book.java7.chapter3;
class Father7 {
    public int money = 8000000;
    public void undertaking() {
        System.out.println("父親的事業:房地產");
    }
}

class Son7 extends Father7 {
    public int money;
    Son7(int money) {
        setMoney(money);
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public void undertaking() {
        System.out.println("兒子的事業:電腦網路");
    }
    public void go() {
        undertaking();
        System.out.println("市值: USD." + money);
        System.out.println("--------------------------");
        super.undertaking();
        System.out.println("市值: USD." + super.money);
    }
}

public class ExtendsSample5 {
    public static void main(String[] args) {
        new Son7(500000).go();
    }
}
