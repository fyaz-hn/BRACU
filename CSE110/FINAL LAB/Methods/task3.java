import java.util.Scanner;
public class task3
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    boolean check=isPrime(sc.nextInt());
    System.out.println(check);
  }
  public static boolean isPrime(int num)
  {
   boolean result=false;
   int count=0;
   for(int i=1;i<=num;i++)
   {
    if(num%i==0)
    {
    count++;
    }
   }
   if(count==2)
   {
   result=true;
   }
   return result;
  }
}