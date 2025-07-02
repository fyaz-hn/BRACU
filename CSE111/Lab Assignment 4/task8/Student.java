//task8
public class Student
{
  public String name,dept,email,password,login,courses[]=new String[3];
  public int id;
  public Student(String name, int id,String dept)
 {
  this.name=name;
  this.id=id;
  this.dept=dept;
  System.out.println("Student object is created");
 }  
}