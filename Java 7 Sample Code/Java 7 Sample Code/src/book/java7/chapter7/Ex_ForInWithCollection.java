package book.java7.chapter7;
import java.util.*;
public class Ex_ForInWithCollection {
    public static void main(String[] args) {
        ArrayList v = new ArrayList();
        v.add("SCJP");
        v.add("SCWCD");
        v.add("SCBCD");
        v.add("SCMCD");
        for(Object obj:v){
            String data = (String)obj; // 轉型
            System.out.print(data + ", ");
        }
        System.out.println();
    }
}

