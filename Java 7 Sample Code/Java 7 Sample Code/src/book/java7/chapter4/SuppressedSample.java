package book.java7.chapter4;

import java.io.IOException;
import java.sql.SQLException;

public class SuppressedSample {
    public static void main(String[] args) {
        Throwable tw = new Throwable();
        try {
            throw new IOException("IO 例外");
        }
        catch(IOException e) {
            tw.addSuppressed(e);
        }
        try {
            throw new SQLException("SQL 例外");
        } catch(SQLException e) {
            tw.addSuppressed(e);
        }
        
        Throwable[] tws = tw.getSuppressed();
        for(Throwable t : tws) {
            System.out.println(t.getClass() + ":" + t.getMessage());
        }
        
    }
    
}
