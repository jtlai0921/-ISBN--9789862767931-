package book.java7.chapter9; 
import java.util.*;
public class Ex_Formatter {
    public static void main(String[] args){
        Formatter f = new Formatter(System.out);
        f.format("圓週率 = %f", Math.PI);
    }
}
