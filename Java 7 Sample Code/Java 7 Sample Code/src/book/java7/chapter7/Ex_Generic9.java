package book.java7.chapter7;
import java.util.*;
public class Ex_Generic9 {
    public static void main(String[] args) {
        ArrayList<Integer> v1 = new ArrayList<>();
        v1.add(100);
        v1.add(200);
        v1.add(300);
        ArrayList<Float> v2 = new ArrayList<>();
        v2.add(1.1f);
        v2.add(2.2f);
        v2.add(3.3f);
        printMyArrayList(v1);
        printMyArrayList(v2);
        /*
        ArrayList<String> v3 = new ArrayList<String>();
        v3.add("Java");
        v3.add("Tiger");
        v3.add("SCJP");
        printMyArrayList(v3);
        */
        /*
        ArrayList v4 = new ArrayList ();
        v4.add(new Integer(10));
        v4.add(new Integer(20));
        v4.add("Java");
        printMyArrayList (v4);
        */
    }
    static void printMyArrayList(ArrayList<? extends Number> v) {
        Iterator<? extends Number> it = v.iterator();
        while(it.hasNext()) {
            Number data = it.next();
            System.out.print(data + ", ");
        }
        System.out.println();
    }
    
}
