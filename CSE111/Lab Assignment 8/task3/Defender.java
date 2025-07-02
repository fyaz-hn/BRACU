//task3
public class Defender extends Football
{
 public int tackles,inter;
 public Defender(String name,int age,int stam,int tackles,int inter)
 {
  super(name,age,stam);
  this.tackles=tackles;
  this.inter=inter;
 }
 public void display()
 {
  super.display();
  System.out.println("Tackles: "+tackles);
  System.out.println("Interceptions: "+inter);
 }
 public void calculatePerformance()
 {
  System.out.println("Performance:"+(double)inter/tackles);
 }



}