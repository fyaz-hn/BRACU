//task8
public class Employee
{
  public String name;
  public double sal=30000;
  public String des="junior";
  public void newEmployee(String newemp)
  {
   name=newemp;
  }
  public void displayInfo()
  {
   System.out.println("Employee Name: "+name);    
   System.out.println("Employee Salary: "+sal+" TK");
   System.out.println("Employee Designation: "+des);
  }
  public void calculateTax()
  {
   if(sal>30000)
   {
    if(sal<=50000)
    {
     System.out.printf(name+" Tax amount: %.2f Tk\n",(sal*0.1));
    }
    else
    {
     System.out.printf(name+" Tax amount: %.2f Tk\n",(sal*0.3));
    } 
   }
   else
   {
    System.out.println("No need to pay tax");
   }
  }
  public void promoteEmployee(String prom)
  {
   des=prom;
   if(prom.equals("senior"))
   {
    sal+=25000;
    System.out.println(name+" has been promoted to senior");
    System.out.printf("New Salary: %.2f TK\n",sal);
   }   
   else if(prom.equals("lead"))
   {
    sal+=50000;
    System.out.println(name+" has been promoted to lead");
    System.out.printf("New Salary: %.2f TK\n",sal);
   }   
   else if(prom.equals("manager"))
   {
    sal+=75000;
    System.out.println(name+" has been promoted to manager");
    System.out.printf("New Salary: %.2f TK\n",sal);
   }
  }
}