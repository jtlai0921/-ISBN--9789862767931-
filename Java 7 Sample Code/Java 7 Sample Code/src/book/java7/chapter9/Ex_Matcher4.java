package book.java7.chapter9; 
import java.util.regex.*;
public class Ex_Matcher4 {
    public static void main(String[] args) {
        Pattern ptn = Pattern.compile("[:/.]+");
        String[] tokens1, tokens2, tokens3;
        tokens1 = ptn.split("http://vincentjava.idv.tw");
        for(String token : tokens1) {
            System.out.println(token);
        }
        System.out.println("---------------------------------");
        tokens2 = ptn.split("http://vincentjava.idv.tw", 2);
        for(String token : tokens2) {
            System.out.println(token);
        }
        System.out.println("---------------------------------");
        tokens3 = ptn.split("http://vincentjava.idv.tw", 100);
        for(String token : tokens3) {
            System.out.println(token);
        }
    }
}
