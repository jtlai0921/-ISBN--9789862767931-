package book.java7.chapter9;
public class Ex_Wrapper2 {
    public static void main(String[] args) {
        int x = 100;
        int y = 200;
        System.out.println("x + y = " + (x+y));
        System.out.println("數字轉字串 ... ");
        String new_x = String.valueOf(x);
        String new_y = String.valueOf(y);
        System.out.println("x + y = " + (new_x + new_y));
    }
}

