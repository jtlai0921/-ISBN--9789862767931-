package book.java7.chapter8;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable_Member {
    public static void main(String[] args) {        
        try(    // 建立 derby connection
                Connection conn = DriverManager.getConnection("jdbc:"
                     + "derby://localhost:1527/sample", "app", "app");
                // 建立 Statement
                Statement stmt = conn.createStatement();                
           ) {            
            // 建立資料表SQL語句
            String sql = "CREATE TABLE APP.MEMBER ( " +
                          "ID INTEGER not null primary key, " +
                          "NAME VARCHAR(10), " +
                          "SEX VARCHAR(1), " +
                          "EMAIL VARCHAR(60)"
                          + ")";

            
            // 將建立資料表SQL語句送入至Statement物件
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
