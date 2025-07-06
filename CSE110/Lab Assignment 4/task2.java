//Task2
import java.util.Scanner;
public class task2
{
  public static void main(String[]args)
  {
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter the value of N");
   int n= sc.nextInt();
   int sum= 0;
   double avg=0;
   System.out.println("Input the "+n+" numbers :");
   for(int i=1; i<=n; i++)
    {  
       int num= sc.nextInt();
       sum +=num;
       System.out.println(num);
    }
   avg= sum/n;
   System.out.println("The sum of "+n+" numbers is : "+sum);
   System.out.println("The average of "+n+" numbers is : "+avg);
  }
}