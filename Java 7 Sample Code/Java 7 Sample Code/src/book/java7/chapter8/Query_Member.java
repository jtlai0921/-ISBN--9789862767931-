package book.java7.chapter8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Query_Member {
    public static void main(String[] args) {        
        // 建立SQL SELECT查詢語句
        String sql = "SELECT ID, NAME, SEX, EMAIL FROM APP.MEMBER";
            
        try(    // 建立 derby connection
                Connection conn = DriverManager.getConnection("jdbc:"
                     + "derby://localhost:1527/sample", "app", "app");
                // 建立 Statement
                Statement stmt = conn.createStatement();
                // 執行 sql select語句並得到一個 ResultSet物件
                ResultSet rs = stmt.executeQuery(sql);
           ) {            
            // 分析ResultSet物件內容
            while(rs.next()) {
                System.out.print(rs.getInt("ID") + "\t");
                System.out.print(rs.getString("NAME") + "\t");
                System.out.print(rs.getString("SEX") + "\t");
                System.out.println(rs.getString("EMAIL"));
            }
            
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
