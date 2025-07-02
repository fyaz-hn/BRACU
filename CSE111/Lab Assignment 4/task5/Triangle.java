//task5
public class Triangle
{
 public int a,b,c,pm;
 public String type;
 public void updateSides(int a,int b, int c)
 {
  this.a=a;
  this.b=b;
  this.c=c;
  pm=a+b+c;
 }
 public void triangleDetails()
 {
  System.out.println("Three sides of the triangle are: "+a+", "+b+", "+c+"\nPerimeter: "+pm);
 }
 public void compareTrinagles(Triangle t)
 {
  if (this==t)
  {
   System.out.println("These two triangle objects have same address.");
  }
  else
  {
   if(this.a==t.a &&this.b==t.b &&this.c==t.c)
   {
    System.out.println("Addresses are different but the sides of the triangles are equal.");
   }
   else if(this.pm==t.pm) //this.a+b+c dile work kore na
   {
    System.out.println("Only the perimeter of both triangles is equal.");
   }
   else
   {
    System.out.println("Adresses, length of the sides and perimeter all are different.");
   }
  }
 }
 public String printTriangleType()
 {
  if (a==b && b==c)
  {
//    type="Equilateral Triangle.";
//   System.out.print("This is an ");
   type="This is an Equilateral Triangle";
  }
  else if((a==b && b!=c) || (b==c && a!=b) || (a==c && a!=b))
  {
//    type="Isosceles Triangle.";
//   System.out.print("This is an ");
   type="This is an Isosceles Triangle";
  }
  else
  {
//   type="Scalene Tringle.";
//   System.out.print("This is a ");
   type="This is a Scalene Triangle";
  }
  return type;
 }
}