//task2
import java.util.Scanner;
public class task2
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter numbers: ");
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    int min=Math.min(n1,n2);
    int max=Math.max(n1,n2);
    int pmcount=0;
    for(int i=min;i<=max;i++)
    {
     int count=0;
     for(int j=2; j<=i;j++)
     {
      if(i%j==0)
      {
      count++;
      }
     }
     if(count==1)
     {
      pmcount++;
     }
    }
    System.out.println("There are "+pmcount+" prime numbers between "+min+" and "+max);
  }
}