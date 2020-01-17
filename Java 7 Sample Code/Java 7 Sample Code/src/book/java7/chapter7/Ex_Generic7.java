package book.java7.chapter7;
import java.util.*;
public class Ex_Generic7 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(100);
        List v5 = v;
        v5.add("Java");	
        Integer i = v.get(0);
        Integer k = v.get(1);
        System.out.println(k);
    }
}

