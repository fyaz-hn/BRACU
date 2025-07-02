//task4
public class Circle
{
  private double rad;
  private double area;
  public static int count;
  public Circle()
  {
  }
  public Circle(int rad)
  {
   count++;
   this.rad=rad;
  }
  public double getRadius()
  {
   return rad;
  }
  public double area()
  {
   area=rad*rad*Math.PI;
  return area;
  }
 }