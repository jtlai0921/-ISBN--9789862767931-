package book.java7.chapter3;
public class Encapsulation {
    public static void main(String[] args) {
        MyAccount account = new MyAccount();
        account.setMoney(10000);
        System.out.println("$" + account.getMoney());
    }
}
class MyAccount {
    private int money; // private 的存取權限
    public void setMoney(int money) {
        this.money = money;
    }
    public int getMoney() {
        return money;
    }
}
