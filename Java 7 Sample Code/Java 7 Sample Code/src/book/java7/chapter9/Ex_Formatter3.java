package book.java7.chapter9;
import java.util.*;
import java.io.*;
public class Ex_Formatter3 {
    public static void main(String[] args){
        try {
            Formatter f = new Formatter(new File("src/book/java7/chapter9/"
                    + "Foo.txt"));
            f.format("圓週率 = %f", Math.PI);
            f.close();
        }
        catch(FileNotFoundException e) {
        }
    }
}
