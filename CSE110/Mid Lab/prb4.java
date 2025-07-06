import java.util.Scanner;
public class prb4
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    double A= sc.nextDouble();
    double B= sc.nextDouble();
    double C= sc.nextDouble();
    double div= Math.pow(B,2)-4*A*C;
    if (A==0 || div<0)
    {
     System.out.println("Impossible to calculate");
    }
    else
    {
     double x1= (-B+Math.sqrt(div))/(2*A);
     double x2= (-B-Math.sqrt(div))/(2*A);
     System.out.printf("Root#1 =%.5f\n",x1);
     System.out.printf("Root#2 =%.5f\n",x2); 
    }
  }
}