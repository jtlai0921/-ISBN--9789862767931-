package book.java7.chapter3;
public class Enumerated3 {
    public enum Week {Sunday, Monday, Tuesday, Wednesday,
                             Thursday, Friday, Saturday}
    public static void main(String[] args) {
        switch(Week.Monday) {
            case Monday:
                System.out.println("星期一猴子穿新衣!");
                break;
            case Tuesday:
                System.out.println("星期二猴子去烤肉!");
                break;
            case Wednesday:
                System.out.println("星期三猴子去爬山!");
                break;
        }    
    }
}
