package book.java7.chapter8;
import javax.sql.RowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class JdbcRowSetDemo {

    public static void main(String[] args) throws Exception {

        RowSetFactory factory = RowSetProvider.newFactory();
        try (RowSet rowSet = factory.createJdbcRowSet()) {
            rowSet.setUrl("jdbc:derby://localhost:1527/sample");
            rowSet.setUsername("app");
            rowSet.setPassword("app");

            rowSet.setCommand("select ID, NAME, SEX, EMAIL from APP.MEMBER");
            rowSet.execute();//執行查詢   

            while (rowSet.next()) {
                System.out.print(rowSet.getInt("ID") + "\t");
                System.out.print(rowSet.getString("NAME") + "\t");
                System.out.print(rowSet.getString("SEX") + "\t");
                System.out.println(rowSet.getString("EMAIL"));
            }
        }
    }
}
