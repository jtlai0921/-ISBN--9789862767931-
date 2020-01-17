package book.java7.chapter9;
import java.text.*;
public class Ex_DecimalFormat {
    public static void main(String[] args) {
        int apple = 96;
        int total = apple * 986 * 867;
        System.out.println("總共:"+total+"元.");
        DecimalFormat d = new DecimalFormat();
        System.out.println("總共:"+d.format(total)+"元.");
    }
}

