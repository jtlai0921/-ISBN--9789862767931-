package book.java7.chapter9;
public class Ex_Wrapper1 {
    public static void main(String[] args) {
        String x = "100";
        String y = "200";
        System.out.println("x + y = " + (x+y));
        System.out.println("字串轉數字 ... ");
        int new_x = Integer.parseInt(x);
        int new_y = Integer.parseInt(y);
        System.out.println("x + y = " + (new_x + new_y));
    }

}
