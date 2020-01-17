package book.java7.chapter8;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AppendRecord_Member {
    public static void main(String[] args) {        
        try(    // 建立 derby connection
                Connection conn = DriverManager.getConnection("jdbc:"
                     + "derby://localhost:1527/sample", "app", "app");
                // 建立 Statement
                Statement stmt = conn.createStatement();                
           ) {            
            // 建立 derby driver instance
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            
            // 建立紀錄資料Record SQL語句
            String sql = "INSERT INTO APP.Member (id, name, sex, email) " +
                         "VALUES (1, \'Vincent\', \'男\', \'vincent@xxx.xxx\')";
            
            // 建立紀錄資料Record SQL語句送入至Statement物件
            int count = stmt.executeUpdate(sql);
            System.out.println("異動筆數:" + count);
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
