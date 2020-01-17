package book.java7.chapter8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchUpdate_Member {
public static void main(String[] args) {        
        try(    // 建立 derby connection
                Connection conn = DriverManager.getConnection("jdbc:"
                     + "derby://localhost:1527/sample", "app", "app");
                // 建立 Statement
                Statement stmt = conn.createStatement();                
           ) {            
            // 建立 derby driver instance
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            
            // 建立2筆紀錄資料Record SQL語句
            String sql = "INSERT INTO APP.Member (id, name, sex, email) " +
                         "VALUES (2, \'Anita\', \'女\', \'anita@xxx.xxx\')";
            String sql2 = "INSERT INTO APP.Member (id, name, sex, email) " +
                         "VALUES (3, \'Joanna\', \'女\', \'joanna@xxx.xxx\')";
            
            // 清除批次快取
            stmt.clearBatch();
            // 加入批次
            stmt.addBatch(sql);
            stmt.addBatch(sql2);            
            // 將批次內的SQL語句一次送到資料庫
            int[] count = stmt.executeBatch();
            
            System.out.println("異動筆數:");
            for(int c : count) {
                System.out.println(c);
            }
        } catch (Exception e) {
            System.out.print(e);
        }
    }    
}
