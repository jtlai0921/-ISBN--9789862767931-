package book.java7.chapter9; 
import java.text.*;
import java.util.*;
public class Ex_DateFormat2 {
    public static void main(String[] args) {
        Date d = null;
        String ds = "2013年4月2日";
        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG,
                                                   Locale.TAIWAN);
        try {
            d = df.parse(ds);
        }
        catch(ParseException e) {
            System.out.println("Unable to parse " + ds);
        }
        System.out.println(d);
        System.out.println(df.format(d));
    }
}

