package book.java7.chapter7;
import java.util.*;
public class Ex_Generic2 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        v.add("Java");
        v.add("Tiger");
        v.add("SCJP");
        for(String obj:v){
            String data = obj; // 不用轉型
            System.out.print(data + ", ");
        }
        System.out.println();
    }
}

