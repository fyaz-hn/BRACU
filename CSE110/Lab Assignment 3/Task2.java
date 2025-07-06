//Task 2
import java.util.Scanner;
public class Task2
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter Score : ");
    int num= sc.nextInt();
   
    if (num<=100 && num>=90)  
    {
    System.out.println("Your grade is A ");
    }
    else if (num<=89 && num>=85)  
    {
    System.out.println("Your grade is A- ");
    }
    else if (num<=84 && num>=70)  
    {
    System.out.println("Your grade is B ");
    }
    else if (num<=69 && num>=57)  
    {
    System.out.println("Your grade is C ");
    }
    else if (num<=56 && num>=50)  
    {
    System.out.println("Your grade is D ");
    }
    else if (num<50)  
    {
    System.out.println("Your grade is F ");
    }
  }
}