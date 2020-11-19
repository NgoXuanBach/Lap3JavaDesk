
package dbUtills;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class MyConnection {
    public static Connection makeConnection() {
        Connection cn = null;
        try {
            //najp driver tuwf file jar
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Lab3JavaDesk111";
            cn = DriverManager.getConnection(url, "sa", "B1782000.");
        } catch (Exception e) {
            if (e.getMessage().contains("connections")) {
                JOptionPane.showMessageDialog(null,"Không thể kết nối tới Database");

            }
        }
        return cn;

    }
}
