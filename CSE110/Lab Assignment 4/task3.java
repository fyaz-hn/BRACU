//Task3
import java.util.Scanner;
public class task3
{
  public static void main(String[]args)
  {
   Scanner sc= new Scanner(System.in);  
   while(true)
   {
     System.out.println("Enter Number : ");
     int num= sc.nextInt();
     if (num>=0)
     {
     int sq= num*num;
     System.out.println(num+" ^ 2 = "+sq);
     }
     else if (num<0)
     {
       break;
     }
    }
  }
}