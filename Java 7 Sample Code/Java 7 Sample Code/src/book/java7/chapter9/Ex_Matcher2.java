package book.java7.chapter9; 
import java.util.regex.*;
public class Ex_Matcher2 {
    public static void main(String[] args) {
        Pattern ptn = Pattern.compile("saw", 
                                      Pattern.CASE_INSENSITIVE);
        Matcher mch = ptn.matcher("I saw a saw");
        while (mch.find()) {
            System.out.println(mch.start() + " - " + (mch.end()-1));
        }
    }
}

