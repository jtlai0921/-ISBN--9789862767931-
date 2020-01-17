package book.java7.chapter9;
import java.io.*;
import java.util.*;
public class Ex_Scanner2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("src/book/java7/chapter9/"
                    + "Portofolio.txt"));
            sc.useDelimiter(",|#"); // 自定分隔符號
            System.out.println("下單資訊:");
            float cost = 0;
            while (sc.hasNextInt()) {
                int sNo = sc.nextInt();
                String sName = sc.next();
                float price = sc.nextFloat();
                int qty = sc.nextInt();
                System.out.println("--------------------------");
                System.out.println("股票代號 : " + sNo);
                System.out.println("股票名稱 : " + sName);
                System.out.println("成交價格 : NT. " + price);
                System.out.println("委託張數 : NT. " + qty);
                cost += price * qty * 1000;
            }
            System.out.println("--------------------------");
            System.out.printf("總成本 : NT. %,.2f%n", cost);
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
