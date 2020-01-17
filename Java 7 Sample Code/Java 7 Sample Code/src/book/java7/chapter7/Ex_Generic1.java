package book.java7.chapter7;
import java.util.*;
public class Ex_Generic1 {
    public static void main(String[] args) {
        Vector  v = new Vector ();
        v.add("Java");
        v.add("Tiger");
        v.add("SCJP");
        for(Object obj:v){
            String data = (String)obj; // 轉型
            System.out.print(data + ", ");
        }
        System.out.println();
    }
}

