//task2
public class Shape
{
  public String shape;
  public String out="Shape name: ";
  public double area;
  public void setParameters(String sh,int a )
  {
   shape=sh;
   area=Math.PI*a*a;
   area=Math.round(area*100)/100.0;
   out=out+shape+"\nArea: "+area;
  }
  public void setParameters(String sh,int a,int b)
  {
   shape=sh;
   area=a*b/2;
   out=out+shape+"\nArea: "+area;
  }
  public void setParameters(String sh,double a,double b )
  {
   shape=sh; 
   area=a*b;
   area=Math.round(area*100)/100.0;
   out=out+shape+"\nArea: "+area;
  }
  public String details()
  {
   return out;
  }
}