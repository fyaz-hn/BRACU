import java.util.Scanner;
public class prb5
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    int a= sc.nextInt();
    int d= sc.nextInt();
    int n= sc.nextInt();
    int i=1;
    for (i=a; i<=n-d; i+=d)
    {
      System.out.print(i+",");
    }
     System.out.print(i);
  }
}
      //Complete but need to undestand better
