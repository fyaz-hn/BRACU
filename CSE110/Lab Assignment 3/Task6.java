//Task 6
import java.util.Scanner;
public class Task6
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter number :");
    int num= sc.nextInt();
    if (num<0)
    {
     System.out.println("Number is negative ");
    }
    else if (num>=0 && num%2==0)
    {
     System.out.println("Number is positive and even ");
    }
    else
    {
     System.out.println("Number is positive and odd ");
    }
    sc.close();
  }
}