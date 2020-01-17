package lab.session3;

import javax.sql.*;
import javax.sql.rowset.*;

public class RowSetDemo {

    public static void main(String[] args) throws Exception {

        RowSetFactory factory = RowSetProvider.newFactory();
        try (RowSet rowSet = factory.createJdbcRowSet()) {
            rowSet.setUrl("jdbc:derby://localhost:1527/sample");
            rowSet.setUsername("app");
            rowSet.setPassword("app");

            rowSet.setCommand("select MYID, MYNAME from APP.EMPLOYEES");
            rowSet.execute();//執行查詢   

            while (rowSet.next()) {
                int id = rowSet.getInt("MYID");
                String name = rowSet.getString("MYNAME");
                System.out.println(id + " : " + name);
            }
        }
    }
}
