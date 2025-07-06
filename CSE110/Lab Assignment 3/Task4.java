//Task 4
import java.util.Scanner;
public class Task4
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter number :");
    int num= sc.nextInt();
   
     if (num%5==0 && num%7==0)  
     {
     System.out.println("Divisible by both ");
     }
     else if (num%5!=0 && num%7==0)  
     {
     System.out.println("Invalid: Divisible by 7 only ");
     }
     else if (num%5==0 && num%7!=0)  
     {
     System.out.println("Invalid: Divisible by 5 only ");
     }
     else if (num%5!=0 && num%7!=0)  
     {
     System.out.println("NO ");
     }
    sc.close();
  }
}
