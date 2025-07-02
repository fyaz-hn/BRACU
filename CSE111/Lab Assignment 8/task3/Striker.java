//task3
public class Striker extends Football
{
 public int goals,shots;
 public Striker(String name,int age,int stam,int goals,int shots)
 {
  super(name,age,stam);
  this.goals=goals;
  this.shots=shots;
 }
 public void display()
 {
  super.display();//concept
  System.out.println("Goals: "+goals);
  System.out.println("Shots on target: "+shots);
 }
 public void calculatePerformance()
 {
  System.out.println("Performance:"+(double)goals/shots);//concept∞
 }
}