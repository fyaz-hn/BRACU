//Task 9
import java.util.Scanner;
public class task9 
{
 public static void main(String[]args)
 {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Number : ");
    int num= sc.nextInt();
    int count=0;
    while(true)
    {
     num/=10;
     count++;
     if(num==0)
     {
      break;
     }
    }
    System.out.println("Total digits = "+count); 
 }
}
