//Task10
import java.util.Scanner;
public class Task10
{
  public static void main(String[]args)
 {
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter number 1 : ");
    float num1= sc.nextFloat();
    System.out.println("Enter number 2 : ");
    float num2= sc.nextFloat();
    System.out.println("Enter number 3 : ");
    float num3= sc.nextFloat();
    
   if (num1>num2 && num1>num3)
   {
    System.out.println("Largest number = "+num1);    
   }
   else if (num2>num3 && num2>num1)
   {
    System.out.println("Largest number = "+num2);
   }
   else if (num3>num1 && num3>num2)
   {
    System.out.println("Largest number = "+num3);
   }
  sc.close();
 }
}