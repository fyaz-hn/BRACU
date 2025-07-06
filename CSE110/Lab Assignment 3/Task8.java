//Task 8
import java.util.Scanner;
public class Task8
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Id:");
    int num= sc.nextInt();
    int num1= num/100000;
    int num2= num1/10;
    int num3= num1%10;
    if (num3==1)
    {
      System.out.println("Student joined BRAC in Spring "+num2);
    }
    else if(num3==2)
    {
       System.out.println("Student joined BRAC in Fall "+num2);
    }
   else if(num3==3)
   {
      System.out.println("Student joined BRAC in Summer "+num2);
   }
    sc.close();
  }
}