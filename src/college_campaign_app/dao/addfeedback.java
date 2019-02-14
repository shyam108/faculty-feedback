package college_campaign_app.dao;

import college_campaign_app.dbutil.Dbconnection;
import college_campaign_app.pojo.Candidates;
import college_campaign_app.pojo.feedbackdetails;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class addfeedback {
    public static boolean addfeedbacks(feedbackdetails obj)throws SQLException
        {
            Connection conn=Dbconnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into feedback values(?,?,?,?,?,?,?)");
        ps.setInt(1,obj.getRollno());
        ps.setString(2,obj.getFacultyName());
        ps.setInt(3,obj.getSubKnowledge());
        ps.setInt(4,obj.getPersanality());
        ps.setInt(5,obj.getClasshandel());
        ps.setInt(6,obj.getCommunication());
        ps.setString(7,obj.getFeedback());
        int count=ps.executeUpdate();
        return(count==1);
        } 
    
      public static ArrayList<feedbackdetails> getFeedback()throws SQLException
    {
         Connection conn=Dbconnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select * from feedback");
        ArrayList<feedbackdetails> feedbackList=new ArrayList<>();
        while(rs.next())
        {
            int rollno=rs.getInt(1);
            String facultyName=rs.getString(2);
            int subKnowledge=rs.getInt(3);
            int persanality=rs.getInt(4);
            int classhandel=rs.getInt(5);
            int communication=rs.getInt(6);
            String feedback=rs.getString(7);
            
            feedbackdetails obj=new feedbackdetails(rollno,facultyName,subKnowledge,persanality,classhandel,communication,feedback);
            feedbackList.add(obj);
        }
        return feedbackList;
    }
    
   
}
