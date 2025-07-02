//task5
public class Course
{
  public String coursename;
  public String coursecode;
  public int coursecredit;
 public void updateDetails(String name,String code,int credit) 
 {
   coursename=name;
   coursecode=code;
   coursecredit=credit;
 }
 public void displayCourse()
 {
  System.out.println("Course Name: "+coursename);
  System.out.println("Course Code: "+coursecode);
  System.out.println("Course Credit: "+coursecredit);
 }
}

/*String coursename,coursecode,int coursecredit*/
//this name=name; eikhane this name keno use hoi na