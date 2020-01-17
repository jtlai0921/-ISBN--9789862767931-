package book.java7.chapter7;
import java.util.*;
public class Ex_Generic3 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(new Integer(100));
        v.add(new Integer(200));
        v.add(new Integer(300));
        for(Integer obj:v){
            Integer data = obj; // 不用轉型
            System.out.print(data.intValue() + ", ");
        }
        System.out.println();
    }
}

