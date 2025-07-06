import java.util.Scanner;
public class task5
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    double t=calcTax(sc.nextInt(),sc.nextInt());
    System.out.printf("%.1f\n",t);
  }
  public static double calcTax(int age,int sal)
  {
   double tax=0;
   if(age>=18)
   {
    if(sal>=10000)
    {
     if(sal>=10000 && sal<=20000)
     {
      tax=0.07*sal;
     }
     else if(sal>20000)
     {
     tax=0.14*sal;
     }
    }
   }
   return tax;
  }
}