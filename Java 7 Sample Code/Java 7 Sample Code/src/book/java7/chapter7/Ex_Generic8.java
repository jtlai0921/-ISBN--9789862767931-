package book.java7.chapter7;
import java.util.*;
public class Ex_Generic8 {
    public static void main(String[] args) {
        ArrayList <String> v1 = new ArrayList <>();
        v1.add("Java");
        v1.add("Tiger");
        v1.add("SCJP");
        ArrayList <Integer> v2 = new ArrayList <>();
        v2.add(100);
        v2.add(200);
        v2.add(300);
        printMyArrayList(v1);
        printMyArrayList(v2);
    }
    static void printMyArrayList(ArrayList <?> v) {
        Iterator<?> it = v.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + ", ");
        }
        System.out.println();
    }
}
