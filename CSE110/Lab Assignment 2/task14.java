//Task 14
public class task14 
{
  public static void main (String [] args) 
  { 
    double a= 8;
    double a1= a/2;
    double b= 3;
    double c= Math.sqrt(a1*a1+b*b); //Length of one side
   
    System.out.printf("Area of hexagon = %.2f\n", 3*Math.sqrt(3)/2*c*c);
    System.out.println("Circumference of hexagon ="+6*c);   
  }
}
