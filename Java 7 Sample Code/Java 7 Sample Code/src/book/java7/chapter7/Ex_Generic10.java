package book.java7.chapter7;
import java.util.*;
public class Ex_Generic10 {
    public static void main(String[] args) {
        ArrayList<Integer> v = new ArrayList<>();
        v.add(100);
        v.add(200);
        v.add(300);
        System.out.println("總合 = " + sum(v));
    }
    static <A extends Number> int sum(ArrayList<A> v) {
        int sum = 0;
        Iterator<A> it = v.iterator();
        while(it.hasNext()) {
            sum += it.next().intValue();
        }
        return sum;
    }
}
