package college_campaign_app.pojo;
public class student {
    private int rollno;
    private String pwd;
    /*CONSTRUCTARS*/
    public student()
    {
    }
    public student(int rollno,String pwd)
    {
       this.rollno=rollno;
       this.pwd=pwd;
    }
    /*GETTER AND SETTER METHODS*/
    public int getroll()
    {
       return rollno;
    }
    public String getpwd()
    {
       return pwd;
    }
    public void setrollno(int rollno)
    {
       this.rollno=rollno;
    }
    public void setpwd(String pwd)
    {
       this.pwd=pwd;
    }
}
