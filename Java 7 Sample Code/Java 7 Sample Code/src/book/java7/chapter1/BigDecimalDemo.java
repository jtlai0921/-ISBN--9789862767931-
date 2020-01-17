package book.java7.chapter1;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        double x = 0.3 + 0.3 + 0.3;
        System.out.print(x == 0.9);
        
        BigDecimal y = new BigDecimal("0.3");
        y = y.add(y).add(y);
        System.out.print(y.doubleValue() == 0.9);
    }
}
