//task1
import java.util.Scanner;
public class task1
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter numbers: ");
    int Sum=0;
    int Max=0;
    int Min=0;
    int noodd=0;
    int odd=0;
    double avg=0;
    for(int i=0; i<10;i++)
    {
     int num=sc.nextInt();
     if(num>0 && num%2!=0)
     {
      odd++;
      Sum+=num;
      Max=Math.max(Max,num);//0,23-23,25-25,31-,53,99,133,45321
      if(Min==0)
      {
       Min=Math.min(Max,num);//0,23
      }
      Min=Math.min(Min,num);//23,23-23,25-23,31-23,3-3,53
     }
     else
     {
      noodd++;
     }
    }
    if(noodd==10)
    {
    System.out.println("No odd positive numbers found");
    }
    else
    {
     avg=Sum;
     System.out.println("Sum = "+Sum);
     System.out.println("Minimum = "+Min);
     System.out.println("Maximum = "+Max);
     System.out.println("Average = "+avg/odd);
    }
    sc.close();
  }
}