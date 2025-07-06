//Task 11
import java.util.Scanner;
public class task11
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    int num= sc.nextInt();
    int sum=0;
    int count=0;
    for(int i=1; i<=num; i++)
    { 
      int num2= num%i; 
      if (num2==0)
      {
        count++;
        if (i<num)
        {
         sum+=i;
        }
      }
    }  
    if (count==2)
    {
    System.out.println(num+ " is a prime number");
    }
    else 
    {
    System.out.println(num+ " is not a prime number");
    }
    if (sum==num)
    {
    System.out.println(num+" is a perfect number");
    }
    else 
    {
    System.out.println(num+" is not a perfect number");
    }
  }
}
