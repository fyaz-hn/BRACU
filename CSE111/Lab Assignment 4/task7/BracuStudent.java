//task7
public class BracuStudent
{
 public String name,loc;
 public boolean pass;
 public BracuStudent(String name,String loc)
 {
  this.name=name;
  this.loc=loc;
 }
 public void showDetails()
 {
  System.out.println("Student Name: "+name);
  System.out.println("Lives in "+loc);
  System.out.println("Have Bus Pass? "+pass);
 }
 public void getPass()
 {
  pass=true;
 }
 public void updateHome(String loc)
 {
  this.loc=loc; 
 }
}