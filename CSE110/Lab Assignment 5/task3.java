//task3
import java.util.Scanner;
public class task3
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    for(;;)  
    {
     System.out.println("Enter Number:");
     int input=sc.nextInt();
     if(input%2!=0)
     {
      break;
     }
     int count=0;
     for(int i=1; i<=input; i++)
     {
      if(input%i==0)
      {
       count++;
      }
     }
     System.out.println(input+" has "+count+" divisors");    
    }
  }
}
  
  