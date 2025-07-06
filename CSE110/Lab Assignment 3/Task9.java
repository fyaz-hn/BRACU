//Task 9
import java.util.Scanner;
public class Task9
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Age:");
    int num1= sc.nextInt();
    System.out.println("Enter Salary:");
    int num2= sc.nextInt();
    if (num1<18)
    {
      System.out.println("Your tax amount is 0 TK");
    }
    else
    {
      if (num2<10000)
      {
        System.out.println("Your tax amount is 0 TK");
      }
      else if (num2>=10000 && num2<=20000)
      { 
       int num3= num2/20;
       System.out.print("Your tax amount is "+num3+" TK");
      }
      else if (num2>20000)
      { 
       int num4= num2/10;
       System.out.print("Your tax amount is "+num4+" TK");
      }
    }
  }  
} 