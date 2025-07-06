//Task 7
import java.util.Scanner;
public class task7 
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in); 
    int sum=0;
    for (int i=1; i<=10; i++)
    { 
     System.out.println("Enter Number : ");
     int num= sc.nextInt();
     sum+=num;
     System.out.println("Sum = "+sum);
    }
  }
}