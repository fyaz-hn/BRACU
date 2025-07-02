//task8
public class Usis
{
 public int totalAdvisee;
 public Student std[]=new Student[5];
 public Usis()
 {
 System.out.println("Usis is ready to use!");
 }
 public void login(Student std)
 {
  if(std.email==null && std.password==null)
  {
   System.out.println("Email and password need to bet set.");
  }
  else
  {
   std.login="ok";
   System.out.println("Login successful");
  }
 }
 public void advising(Student std)
 {
  if(std.login==null)
  {
   System.out.println("Please login to advise courses!");
  }
  else
  {
   System.out.println("You haven't selected any courses.");
  }
 } 
 public void advising(Student std,String c1,String c2,String c3)
 {  
  if(std.login==null)
  {
   System.out.println("Please login to advise courses!");
  }
  else
  {
   std.courses[0]=c1;
   std.courses[1]=c2;
   std.courses[2]=c3;
   this.std[totalAdvisee]=std; //this na dile kaj kore na
   totalAdvisee++;
   System.out.println("Advising successful!");
  }
 }
 public void advising(Student std,String c1,String c2,String c3,String c4)
 {
  if(std.login==null)
  {
   System.out.println("Please login to advise courses!");
  }
  else
  {
   System.out.println("You need special approval to take more than 3 courses.");
  }
 }
 public void allAdviseeInfo()
 {
  System.out.println("Total Advisee: "+totalAdvisee);
  for(int i=0;i<std.length;i++)
  {
   if(std[i]!=null)
   {
    System.out.println("Name: "+std[i].name+" ID: "+std[i].id);
    System.out.println("Department: "+std[i].dept);
    System.out.println("Advised Course: ");
    for(int j=0;j<std[i].courses.length;j++)
    {
     System.out.print(std[i].courses[j]+" ");
     if(j==std[i].courses.length-1)
     {
      System.out.println();
     }
    }
   System.out.println("==============");
   }
  }
 }
}