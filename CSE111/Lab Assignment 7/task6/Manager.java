//task6code
public class Manager extends Employee
{
 public double bonus,fsal;
 public Manager(String name,double base,int hours,int bonus)
 { 
  super(name,base,hours);
  this.bonus=bonus;
 }
 public void calculateSalary()
 {
  if (getHoursWorked()>40)
  {
  fsal=getBaseSalary()+getBaseSalary()*bonus/100;
  }
  else
  {
  fsal=getBaseSalary();
  }
 }
 public void requestIncrement(int inc)
 {
  if(getHoursWorked()<=80)
  {
   System.out.println("Increment denied.");
  }
  else
  {
   if(getHoursWorked()>100)
   {
    super.setBaseSalary(getBaseSalary()+inc);
    System.out.println("$"+inc+" Increment approved.");
   }
   else
   {
    super.setBaseSalary(getBaseSalary()+inc/2);
    System.out.println("$"+inc/2+" Increment approved.");
   }
  }
 }    
 public void displayInfo() 
 {
   System.out.println("Name: " + name);
   System.out.println("Base Salary: $" +getBaseSalary());
   System.out.println("Work Hours: " + getHoursWorked());
   System.out.println("Bonus: "+bonus+" %");
   System.out.println("Final Salary: $"+fsal);
 }
}