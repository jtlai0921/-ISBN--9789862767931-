package book.java7.chapter8;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateStoredProcedure {
    public static void main(String[] args) {        
        try(    // 建立 derby connection
                Connection conn = DriverManager.getConnection("jdbc:"
                     + "derby://localhost:1527/sample", "app", "app");
                // 建立 Statement
                Statement stmt = conn.createStatement();                
           ) {            
            // 建立紀錄資料Record SQL語句
            String sql = "create procedure getEmail(" +
                         "IN cname varchar(10), " +
                         "OUT cemail varchar(30)) " +
                         "begin " +
                         "select email into cemail from APP.Member " +
                         "where cname = name; " +
                         "select cemail; " +
                         "end;";
            
            // 建立紀錄資料Record SQL語句送入至Statement物件
            int count = stmt.executeUpdate(sql);
            System.out.println("異動筆數:" + count);
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}

