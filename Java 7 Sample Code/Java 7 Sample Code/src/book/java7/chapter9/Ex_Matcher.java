package book.java7.chapter9; 
import java.util.regex.*;
public class Ex_Matcher {
    public static void main(String[] args) {
        Pattern ptn = Pattern.compile("Java [EMS]{2}.*",
                                      Pattern.CASE_INSENSITIVE);
        Matcher mch1 = ptn.matcher("Java SE 7.0");
        Matcher mch2 = ptn.matcher("Java eE 1.4.2");
        Matcher mch3 = ptn.matcher("Java me 1.0");
        Matcher mch4 = ptn.matcher("Java S  9.0");
        Matcher mch5 = ptn.matcher("Java AB 8.0");
        System.out.println(mch1.matches());
        System.out.println(mch2.matches());
        System.out.println(mch3.matches());
        System.out.println(mch4.matches());
        System.out.println(mch5.matches());
    }
}
