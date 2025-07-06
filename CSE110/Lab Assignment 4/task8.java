//Task 8
import java.util.Scanner;
public class task8 
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Number : "); 
    int num= sc.nextInt();
    for (int i=1; i<=num; i++)
    {
     if (i%5==0)
     {
       if(i%3==0)
       {  
       }
       else 
       {
        System.out.println(i); 
       }
     }
    }
  }
}