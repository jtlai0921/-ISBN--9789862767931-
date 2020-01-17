package book.java7.chapter8;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionToDB {
    public static void main(String[] args) {        
        try(// 建立 derby connection
            Connection conn = DriverManager.getConnection("jdbc:"
                     + "derby://localhost:1527/sample", "app", "app");
           ) {            
            // 建立 derby driver instance 
            // JDBC 4.0 之後就不需要透過Class.forName建立
            // Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
