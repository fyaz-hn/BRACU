//not sure if this is 100% complete
//task4
public class Student
{
 public int id,idx;
 public double cg;
 public String courses[];
 public Student(int id,double cg)
 {
  this.id=id;
  this.cg=cg;
  System.out.println("A student with ID "+id+" and cgpa "+cg+" has been created.");
  if(cg<3)
  {
   courses=new String[3];
  }
  else
  {
   courses=new String[4];
  }
 }
 public Student(int id)
 {
  this.id=id;
  System.out.println("A student with ID "+id+" has been created.");
 }
 public void storeCG(double cg)
 {
  this.cg=cg;  
  if(cg<3)
  {
   courses=new String[3];
  }
  else
  {
   courses=new String[4];
  }
 }
 public void addCourse(String crs)
 {
  if(cg==0)
  {
   System.out.println("Failed to add "+crs+"\nSet CG first");
  }
  else
  {
   if(cg<3)
   {
    if(idx<3)
    {
     courses[idx]=crs;
    }
    else
    {
     System.out.println("Failed to add "+crs+"\nCG is low. Can't add more than 3 courses.");
    } 
   }
   else
   {    
    if(idx<4)
    {
     courses[idx]=crs;
    }
    else
    {
     System.out.println("Failed to add "+crs+"\nMaximum 4 courses allowed.");
    }
   }
   idx++;
  }
 } 
 public void addCourse(String crs [])
 {
  if (cg==0)
  { 
   System.out.println("Failed to add ");
   for(int i=0;i<crs.length;i++)
   {
    System.out.print(crs[i]+"");
    if(i==crs.length-1)
    {
     System.out.println("\n Set CG first");
    }
   }
  }
  else
  {
   if(crs.length>courses.length)
   {
    for(int i=0;i<courses.length;i++)
    {
     courses[i]=crs[i];
    }
    System.out.print("Failed to add ");
    for(int i=courses.length;i<crs.length;i++)
    {
     System.out.print(crs[i]+" ");
    }
    System.out.println("\nMaximum "+courses.length+" courses allowed.");
   }
   else
   {
    idx=3;
    courses=crs;
   }
  }
 }
 public void showAdvisee()
 {
  System.out.println("Student ID: "+id+", CGPA: "+cg);
  if(courses[0]==null)
  {
   System.out.println("No courses added."); 
  }
  else
  {
   System.out.println("Added courses are: ");
   for(int i=0;i<courses.length;i++)
   {
    if(courses[i]!=null)
    {
     System.out.print(courses[i]+" ");   
    }
    if(i==courses.length-1)
    {
     System.out.println();
    }
   }
  }
 }
 public void removeAllCourse()
 {
  int length=courses.length;
  courses=new String[length];
 }
 public void storeID(int id)
 {
  this.id=id;
 }
}