
package college_campaign_app.pojo;

public class feedbackdetails {
   private int rollno;
     private String facultyName;
    private int persanality;
    private int subKnowledge;
    private int classhandel;
    private int communication;
    private String feedback;
    
    public feedbackdetails()
    {
        
    }
    public feedbackdetails(int rollno,String facultyName , int persanality, int subKnowledge, int classhandel, int communication,String feedback )
    {
        this.rollno=rollno;
        this.facultyName=facultyName;
        this.persanality=persanality;
        this.subKnowledge=subKnowledge;
        this.classhandel=classhandel;
        this.communication=communication;
        this.feedback=feedback;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public int getPersanality() {
        return persanality;
    }

    public void setPersanality(int persanality) {
        this.persanality = persanality;
    }

    public int getSubKnowledge() {
        return subKnowledge;
    }

    public void setSubKnowledge(int subKnowledge) {
        this.subKnowledge = subKnowledge;
    }

    public int getClasshandel() {
        return classhandel;
    }

    public void setClasshandel(int classhandel) {
        this.classhandel = classhandel;
    }

    public int getCommunication() {
        return communication;
    }

    public void setCommunication(int communication) {
        this.communication = communication;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
