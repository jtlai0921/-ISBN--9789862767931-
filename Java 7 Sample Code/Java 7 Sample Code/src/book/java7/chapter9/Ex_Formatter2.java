package book.java7.chapter9;
import java.util.*;
public class Ex_Formatter2 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("圓週");
        Formatter f = new Formatter(sb);
        f.format("率 = %f", Math.PI); 
        System.out.println(sb);
    }
}
