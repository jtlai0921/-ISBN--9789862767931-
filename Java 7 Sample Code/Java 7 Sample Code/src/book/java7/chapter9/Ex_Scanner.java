package book.java7.chapter9; 
import java.util.*;
public class Ex_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 使用者自行輸入
        System.out.println("請輸入數字 : ");
        int i = sc.nextInt();
        System.out.println("請輸入字串 : ");
        String str = sc.next();
        System.out.println("您輸入的數字是 : " + i);
        System.out.println("您輸入的字串是 : " + str);
        sc.close();
    }
}
