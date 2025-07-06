//task8
import java.util.Scanner;
public class task8
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    int start= sc.nextInt();
    int end= sc.nextInt();
    System.out.println("Armstrong numbers:");
    for(int i=start;i<=end;i++)
    { 
      int num=i;
      int numa=i;
      int numb=i;
      int sum=0;
      int digcount=0;
      for(;;)
      {
       num/=10;
       digcount++;
       if(num==0)
       {
       break;
       }
      }
      int pownum= digcount-1;
      double power=Math.pow(10,pownum);
      int power2=(int)power;
      for(;;)
      {
       numa=numb/power2;
       sum+=Math.pow(numa,digcount); 
       numb%=power2;
       power2/=10;
       if(power2==0)
       {
       break;
       }
      }
      if(sum==i)
      {
      System.out.println(i);
      }
    }
  }
}