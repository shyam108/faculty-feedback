package college_campaign_app.dbutil;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class Dbconnection {
    private static Connection conn;
    static
    {
        try
        {
        Class.forName("oracle.jdbc.OracleDriver");
        conn=DriverManager.getConnection("jdbc:oracle:thin:@//DESKTOP-7UA6Q8N:1521/xe","admin","abcde");
        JOptionPane.showMessageDialog(null,"CONNECTION SUCCESSFULL");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"ERROR IN CONNECTION !");
        }
        
    }
    public  static Connection getConnection()
    {
        return conn;
    }
    public static void CloseConnection()
    {   
        try
        {
            conn.close();
            JOptionPane.showMessageDialog(null, "CONNECTION CLOSED SUCCESSFULLY");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "PROBLEM IN CLOSING CONNECTION");
        }
        
    }
}
