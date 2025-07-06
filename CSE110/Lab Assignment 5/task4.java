//task4
import java.util.Scanner;
public class task4
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    int test=sc.nextInt();
    for(int i=1;i<=test;i++)
    { 
      int sum=0;
      int input1=sc.nextInt();
      int input2=sc.nextInt();
      for(int j=1; j<=input2;j++)
      {
       if(input1%2==0)
       {
       input1++;
       }
       sum+=input1;
       input1+=2;
      }
     System.out.println(sum);
    }
  }
}