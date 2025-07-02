//task3
public class Shape2D
{
 public String shape;
 public double area;
 public Shape2D()
 {
  shape="Square";
  area=5*5;
  System.out.println("A Square has been created with length: 5");
 }
 public Shape2D(int length,int breadth)
 {
  shape="Rectangle";
  area=length*breadth;
  System.out.println("A Rectangle has been created with length: "+length+" and breadth: "+breadth); 
 }
 public Shape2D(int height,int base,String shape)
 {
  this.shape=shape;
  area=height*base/2;
  System.out.println("A "+shape+" has been created with height: "+height+" and base: "+base);
 }
 public Shape2D(int a,int b,int c)
 {
  shape="tri2";
  double s=(a+b+c)/2;
  area=s*(s-a)*(s-b)*(s-c);
  area=Math.sqrt(area);
  area*=100;
  area=(int)area;
  System.out.println("A Triangle has been created with the following sides: "+a+", "+b+", "+c);
 }
 public void area()
 {
  if(shape.equals("Square"))
  {
   System.out.printf("The area of the Square is: %.1f\n",area);
  }
  else if(shape.equals("Rectangle"))
  {
   System.out.printf("The area of the Rectangle is: %.1f\n",area);
  }
  else if(shape.equals("Triangle"))
  {
   System.out.printf("The area of the Triangle is: %.1f\n",area);
  }
  else if(shape.equals("tri2"))
  {
   System.out.println("The area of the Triangle is: "+area/100);
  }
 }
}