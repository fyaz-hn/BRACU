//task6
public class Teacher
{
 public String name,initial,courses[],course;
 public int ccount;
 public Teacher(String name,String initial)
 {
  System.out.println("A new teacher has been created");
  this.name=name;
  this.initial=initial;
 }
 public void printDetail()
 {
  System.out.println("Name: "+name);
  System.out.println("Initial: "+initial);
  System.out.println("List of courses: \n"+course);
//  for(int i=0;i<courses.length;i++)
//  {
//   System.out.println(courses[i]);
//  }
 }
 public void addCourse(Course c)
 { 
  if(course==null)
  {
   course=c.c;
  }
  else
  {
   course+="\n"+c.c;
  }
//  ccount++;
//  courses=new String[ccount];
//  courses[ccount-1]=c.c;
 }
}