import java.util.Scanner;
public class task4
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    boolean check=isPerfect(sc.nextInt());
    System.out.println(check);
  }
  public static boolean isPerfect(int num)
  {
   boolean result=false;
   int sum=0;
   for (int i=1; i<num; i++)
   {
    if(num%i==0)
    {
    sum+=i;
    }
   }
   if (sum==num)
   {
   result=true;
   }
   return result;
  }
}
   