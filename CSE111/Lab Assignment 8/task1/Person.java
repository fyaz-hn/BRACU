//task1
public class Person
{
 public String name,job;
 public int age,dcount;
 public Vaccine v;
 public Person(String name,int age)
 {
  this.name=name;
  this.age=age;
 }
 public Person(String name,int age,String job)
 {
  this.name=name;
  this.age=age;
  this.job=job;
 }
 public void pushVaccine(Vaccine v)
 {
  if(job.equals("Student"))
  {
   this.v=v;
   dcount++;
   System.out.println("1st dose done for "+name);
  }
  else
  {
   if(age>24)
   {
    this.v=v;
    dcount++;
    System.out.println("1st dose done for "+name);
   }
   else
   {
    System.out.println("Sorry "+name+", Minimum age for taking vaccine is 25 years now.");
   }
  }
 }
 public void pushVaccine(Vaccine v,String dose)
 {
  if(dcount==1)
  {
   if(this.v==v)
   {
    dcount++;
    System.out.println("2nd dose done for "+name);
   }
   else
   {
    System.out.println("Sorry "+name+", you can't take 2 different vaccines");
   }
  }
  else if(dcount<2)
  {
   if(dose.equals("1st Dose"))
   {
    this.v=v;
    dcount++;
    System.out.println("1st dose done for "+name);
   }
   else
   {
    System.out.println("Sorry "+name+", invalid dose request.");
   }
  }
  else
  {
   System.out.println("Sorry "+name+", you already received both dose");
  }
 }
 public void showDetail()
 {
  System.out.print("Name : "+name+" Age: "+age);
  if(job==null)
  {
   System.out.println(" Type: General Citizen");
  }
  else
  {
   System.out.println(" Type: "+job); 
  }
  System.out.println("Vaccine name: "+v.getvname());
  if(dcount==1)
  {
   System.out.println("1st Dose: Given");
   System.out.println("2nd Dose: Please come after "+v.getdays()+" days");
  }
  else if(dcount==2)
  {
   System.out.println("1st Dose: Given");
   System.out.println("2nd Dose: Given");
  }
 }
}