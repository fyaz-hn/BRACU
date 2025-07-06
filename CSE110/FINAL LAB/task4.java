import java.util.Scanner;
public class task4
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    boolean check=isHappy(sc.nextInt());
    System.out.println(check);
    sc.close();
  }
  public static boolean isHappy(int num)
  {
   boolean result=false;
   int n=num;
   for(;;)
   {
    int numa=n; //4
    int numb=n;//4
    int sum=0;
    int count=0;
    for(;;)
    {
     numa/=10;//0
     count++;//1
     if (numa==0)
     {
     break;
     }
    }
    int pownum=count-1;//0
    double power=Math.pow(10,pownum);//1
    int power2=(int)power;//1
    for(;;)
    {
     numa=numb/power2;//4/1=4
     sum+=numa*numa;//4*4=16
     numb%=power2;//4%1=0
     power2/=10;//1/10=0
     if(power2==0)
     {
     break;
     }
    }
    if(sum==1)
    {
    result=true;
    break;
    }
    if(sum==4)
    {
    break;
    }
    n=sum;//16
   }
   return result;
  }
}