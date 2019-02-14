package college_campaign_app.dao;

import college_campaign_app.dbutil.Dbconnection;
import college_campaign_app.pojo.student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class studentmethod {
    
     public static boolean register(student obj)throws SQLException
    {
        Connection conn=Dbconnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into  studpwd values(?,?)");
        ps.setInt(1,obj.getroll());
        ps.setString(2,obj.getpwd());
        int count=ps.executeUpdate();
        return(count==1);
    }
     public static boolean validatestudent(int rollno,String pwd)throws SQLException
     {
        Connection conn=Dbconnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select * from studpwd");
       while(rs.next())
        {
            
            int dbrollno=rs.getInt(1);
            String dbpwd=rs.getString(2);
            if(dbrollno==rollno&&pwd.equals(dbpwd))
            {
                return true;
            }
        }
       
        return false;
     }
}
