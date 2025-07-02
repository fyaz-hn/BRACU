//task6code
public class Developer extends Employee
{
 public String lang;
 public double fsal;
 public Developer(String name,double base,int hours,String lang)
 {
  super(name,base,hours);
  fsal=base;
  this.lang=lang;
 }
 public void calculateSalary()
 { 
   if(lang.equals("Java"))
  {
  fsal+=700;
  }
 }
 public void displayInfo() 
 {
    System.out.println("Name: "+name);
    System.out.println("Base Salary: $"+super.getBaseSalary());
    System.out.println("Work Hours: "+super.getHoursWorked());
    System.out.println("Language: "+lang);
    System.out.println("Final Salary: $"+fsal);
 }
}
