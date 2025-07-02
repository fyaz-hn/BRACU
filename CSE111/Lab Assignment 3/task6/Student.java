//task6
public class Student
{
 public String name="Not Set";
 public String schl="Not Set";
 public String dept="CSE";
 public double cg;
 public int cr=9;
 public void showDetails()
 {
  System.out.println("Name: "+name);
  System.out.println("Department: "+dept);
  System.out.println("CGPA: "+cg);
  System.out.println("Credits: "+cr);
  System.out.println("Scholarship Status: "+schl); 
 }
 public void updateDetails(String ipname,double ipcg,int ipcr)
 {
  name=ipname;
  cg=ipcg;
  cr=ipcr;
 }
 public void updateDetails(String ipname,double ipcg)
 {
  name=ipname;
  cg=ipcg;
 }
 public void updateDetails(String ipname,double ipcg,int ipcr,String ipdept)
 {
  name=ipname;
  cg=ipcg;
  cr=ipcr;
  dept=ipdept; 
 }
 public void checkScholarshipEligibility()
 {
  if(cg>=3.5 && cr>10)
  {
   if (cg>=3.7)
   {
    schl="Merit based Scholarship";
    System.out.println(name+" is eligible for Merit based scholarship");
   }
   else
   {
    schl="Need based scholarship"; 
    System.out.println(name+" is eligible for Need based scholarship");
   } 
  }
  else
  {
   schl="No scholarship";
   System.out.println(name+" is not eligible for scholarship");
  }
 }
}