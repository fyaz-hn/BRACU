import java.util.Scanner;
public class prb8
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    System.out.print(n+",");
    for(;;)
    {
     if (n%2==0)
     {
      n/=2;
      System.out.print(n+",");
       if (n==2)
       {
       break;
       }
     }
     if (n%2!=0)
     {
      n=n*3+1;
      System.out.print(n+",");
     }
    }
    System.out.print(n/2);
  }
}