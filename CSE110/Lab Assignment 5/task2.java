//task2
import java.util.Scanner;
public class task2
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    int N=sc.nextInt();
    int sum=0;
    for(int i=1;i<=N;i++)
    {
      for(int j=1; j<=i; j++)
      {
      sum-=j;
      }
    }
    System.out.println("The value of y: "+sum);
  }
}