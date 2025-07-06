//Task 7
import java.util.Scanner;
public class Task7
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Number:");
    int num= sc.nextInt();
    if (num<0)
    {
     System.out.println( "Output:"+(2*num));
    }
    else if(num>=0 && num<2)
    {
      System.out.println( "Output: "+(num+1)); 
    }
    else if(num>=2 && num<5)
    {
      System.out.println( "Output: "+(num*num-1)); 
    }
    else if(num>=5)
    {
      System.out.println( "Output:"+(3*num*num+2)); 
    } 
    sc.close();
  }
}