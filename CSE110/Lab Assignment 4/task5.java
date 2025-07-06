//Task 5
import java.util.Scanner;
public class task5
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter an integer : ");
    int num= sc.nextInt();
    int count=num;
    int count2=0;
    for (int i=1; i<=num; i++)
     {
       System.out.println("Enter number "+i+" : ");
       int num2= sc.nextInt();
       if (num2<0)
      {
       count--;
       count2++;
      }
     }
     System.out.println(count+ " Non-negative Numbers");
     System.out.println(count2+" Negative Numbers");    
  }
}