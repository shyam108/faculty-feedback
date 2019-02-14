package college_campaign_app.dao;
import college_campaign_app.dbutil.Dbconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import college_campaign_app.pojo.Candidates;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class Candidatemethod {
    
    public static boolean addCandidateDetails(Candidates obj)throws SQLException
    {
        Connection conn=Dbconnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into candidate values(?,?)");
        ps.setString(1,obj.getCandidateName());
        ps.setString(2,obj.getCandidateId());
        int count=ps.executeUpdate();
        return(count==1);
    }
    public static boolean deleteCandidateDetails(String id) throws SQLException
     {
         Connection conn=Dbconnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("delete from candidate where id=?");
         ps.setString(1,id);
         int count=ps.executeUpdate();
         return(count==1);
         
      }
      public static boolean updateCandidateDetails(Candidates obj) throws SQLException
    {
        Connection conn=Dbconnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update candidate set name=? where id=?");
       
        ps.setString(1,obj.getCandidateName());
         ps.setString(2,obj.getCandidateId());
        int count=ps.executeUpdate();
        return(count==1);
    }
      
      public static ArrayList<Candidates> getAllCandidate()throws SQLException
    {
         Connection conn=Dbconnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select * from candidate");
        ArrayList<Candidates> CandidateList=new ArrayList<>();
        while(rs.next())
        {
            String id=rs.getString(1);
            String name=rs.getString(2);
            
            Candidates obj=new Candidates(id,name);
            CandidateList.add(obj);
        }
        return CandidateList;
    }
    
}
