//Task 6
import java.util.Scanner;
public class task6 
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Input number of terms : "); 
    int num= sc.nextInt();
    int sum=0;
    System.out.println("The odd numbers are : ");
    for (int i=1; i<=2*num; i++) //To get the number of terms = num, we need to multiply 2 with num
    {
     if (i%2!=0)
     {  
     sum+=i;
     System.out.println(i);  
     }
    }
    System.out.println("The sum of odd Natural numbers up to "+num+" terms is "+ sum); 
  }
}