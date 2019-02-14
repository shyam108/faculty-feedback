package college_campaign_app.pojo;
public class Candidates {
    private String candidateId;
    private String candidateName;
    /*CONSTRUCTARS*/
    public Candidates()
    {
    }
    public Candidates(String id,String name)
    {
       this.candidateId=id;
       this.candidateName=name;
    }
    /*GETTER AND SETTER METHODS*/
    public String getCandidateId()
    {
       return candidateId;
    }
    public String getCandidateName()
    {
       return candidateName;
    }
    public void setCandidateId(String id)
    {
       this.candidateId=id;
    }
    public void setCandidateName(String name)
    {
       this.candidateName=name;
    }
}


   

