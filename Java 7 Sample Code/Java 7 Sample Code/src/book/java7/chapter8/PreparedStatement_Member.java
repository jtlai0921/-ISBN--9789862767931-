package book.java7.chapter8;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatement_Member {
    public static void main(String[] args) {   
        // 建立紀錄資料Record SQL語句
        String sql = "INSERT INTO APP.Member (id, name, sex, email) " +
                     "VALUES (?, ?, ?, ?)";
        
        try(    // 建立 derby connection
                Connection conn = DriverManager.getConnection("jdbc:"
                     + "derby://localhost:1527/sample", "app", "app");
                // 建立 Statement
                PreparedStatement pstmt = conn.prepareStatement(sql);
           ) {            
            // 新增欄位資料
            pstmt.setInt(1, 4);
            pstmt.setString(2, "John");
            pstmt.setString(3, "男");
            pstmt.setString(4, "john@xxx.xxx");
            // PrepareStatement物件內的sql送入到資料庫
            int count = pstmt.executeUpdate();
            System.out.println("異動筆數:" + count);
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
