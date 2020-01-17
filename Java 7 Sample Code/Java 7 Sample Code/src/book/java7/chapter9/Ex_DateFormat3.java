package book.java7.chapter9;
import java.text.*;
import java.util.*;
public class Ex_DateFormat3 {
    public static void main(String[] args) {
        Date d = null;
        String ds = "今天是:2013年4月2日 星期二";
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,
                                                   Locale.TAIWAN);
        d = df.parse(ds, new ParsePosition(4));
        System.out.println(d);
        System.out.println(df.format(d));

    }
}
