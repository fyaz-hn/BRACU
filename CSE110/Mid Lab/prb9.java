import java.util.Scanner;
public class prb9
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    int num= sc.nextInt(); //sample-7546
    int numa=num;
    int numb=num;
    int count=0;
    int sum=0;
    while(true)
    { 
      num/=10; // 7546/10=754.....7/10=0
      count++; //count=0+1....4
      if(num==0)
      {
        break;
      }
    }
    double pownum= count-1; //4-1=3
    double power= Math.pow(10,pownum);//10^3
    int power2= (int)power;
    for (;;)
    { 
     numa=numb/power2; // 7546/10^3=7....5....4
     numb%=power2; //7546%10=546....46....6
     power2/=10;  //10^3/10=10^2....10...1
     sum+=numa;  //7+5+4
     if(power2==1)
     {
       break;
     }
    }
    sum+=numb; //16+6
    if(sum%2==0)
    {
     System.out.println("The sum is even");
    }
    else
    {
      System.out.println("The sum is odd");
    }
  }
}