//Task11
import java.util.Scanner;
public class Task11
{
  public static void main(String[]args)
 {
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter side 1 : ");
    int num1= sc.nextInt();
    System.out.println("Enter side 2 : ");
    int num2= sc.nextInt();
    System.out.println("Enter side 3 : ");
    int num3= sc.nextInt();
    
   if (num1==num2 && num2==num3)
   {
    System.out.println("This is an Equilateral Triangle  ");    
   }
   else if (num1==num2)
   {
    System.out.println("This is an Isosceles Triangle  ");
   }
   else if (num1==num3)
   {
    System.out.println("This is an Isosceles Triangle  ");
   }
   else if (num2==num3)
   {
    System.out.println("This is an Isosceles Triangle  ");
   }
   else 
   {
    System.out.println("This is a Scalene Triangle  ");
   }
    sc.close();
 }
}