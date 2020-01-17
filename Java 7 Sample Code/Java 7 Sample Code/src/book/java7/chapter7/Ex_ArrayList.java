package book.java7.chapter7;
import java.util.*;
public class Ex_ArrayList {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("SCJP");
        al.add("SCWCD");
        al.add("SCBCD");
        al.add("SCMCD");
        ListIterator it = al.listIterator();
        while(it.hasNext()){
            int index = it.nextIndex();
            String data = (String)it.next();
            System.out.print(index + "=" + data + ", ");
        }
        System.out.println();
    }
}

