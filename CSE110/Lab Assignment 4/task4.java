//Task 4
import java.util.Scanner;
public class task4
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter number : ");
    int num= sc.nextInt();
    System.out.println("The divisors of "+num+" :"); 
    for (int i=1; i<=num; i++)
    { 
     int num2= num%i;
     if (num2==0)
     {  
     System.out.println(i);
     }
    }
  }
}