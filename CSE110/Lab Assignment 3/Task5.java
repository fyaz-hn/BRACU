//Task 5
import java.util.Scanner;
public class Task5
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter Year :");
    int num= sc.nextInt();
   
    if (num%4==0)  
    {
      if (num%100!=0)
      {
      System.out.println(num+" is a leap year");
      }
      else if (num%100==0 && num%400==0)
      {
       System.out.println(num+" is a leap year");
      }
      else
      {
       System.out.println(num+" is not a leap year");
      }
    }
    else
    {
     System.out.println(num+" is not a leap year");
    }
    sc.close(); 
  }
}