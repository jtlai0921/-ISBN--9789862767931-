package book.java7.chapter8; 
import java.io.*;
public class AddInt implements Serializable {
    private static final long serialVersionUID = 1;
    private int sum = 0;
    //private transient int sum = 0;  //transient modifier
    public void calc(int... c) {
        for(int i=0;i<c.length;i++) {
            sum += c[i];
        }
    }
    public int getSum() {
        return sum;
    }
}
