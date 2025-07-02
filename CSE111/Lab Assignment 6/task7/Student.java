//task7
public class Student
{
  public String name,dept="CSE";
  public double cg;
  public static int ts,csts,othts;
  public Student()
  {}
  public Student(String name,double cg)
  {
   ts++;
   csts++;
   this.name=name;
   this.cg=cg;
  }
  public Student(String name,double cg,String dept)
  {
   ts++;
   if(dept.equals("CSE"))
   {
    csts++;
   }
   else
   {
    othts++;
   }
   this.name=name;
   this.cg=cg;
   this.dept=dept;
  }
  public void individualDetail()
  {
   System.out.println("ID: "+ts);
   System.out.println("Name: "+name);
   System.out.println("CGPA: "+cg);
   System.out.println("Department: "+dept);
  }
  public static void printDetails()
  {  
   System.out.println("Total Student(s): "+ts);
   System.out.println("CSE Student(s): "+csts);
   System.out.println("Other Department Student(s): "+othts); 
  }
}
  