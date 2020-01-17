package book.java7.chapter8;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Savepoint;
import java.sql.Statement;

public class JDBCTransaction {
    public static void main(String[] args) {        
        // 建立SQL SELECT查詢語句
        String sql = "SELECT ID, NAME, SEX, EMAIL FROM APP.MEMBER";
            
        try( // 建立 derby connection
             Connection conn = DriverManager.getConnection("jdbc:"
                     + "derby://localhost:1527/sample", "app", "app");
             // 建立 Statement
             Statement stmt = conn.createStatement();
                
           ) {                        
            // 設定認可模式
            conn.setAutoCommit(false);
            stmt.executeUpdate("insert into APP.MEMBER values"
                    + "(5,'Sam', '男', 'sam@xxx.xxx')");
            Savepoint point = conn.setSavepoint("point"); // RollBack回復點
            stmt.executeUpdate("insert into APP.MEMBER values"
                    + "(6,'Jane', '女', 'jane@xxx.xxx')");
            conn.rollback(point); // 回復動作
            conn.releaseSavepoint(point); // 釋放回復點
            stmt.executeUpdate("insert into APP.MEMBER values"
                    + "(7,'Tom', '男', 'tom@xxx.xxx')");
            conn.commit();// 認可提交
            
            // 執行 sql select語句並得到一個 ResultSet物件
            ResultSet rs = stmt.executeQuery(sql);
            // 分析ResultSet物件內容
            while(rs.next()) {
                System.out.print(rs.getInt("ID") + "\t");
                System.out.print(rs.getString("NAME") + "\t");
                System.out.print(rs.getString("SEX") + "\t");
                System.out.println(rs.getString("EMAIL"));
            }
            rs.close();
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
