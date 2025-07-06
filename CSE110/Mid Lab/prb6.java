import java.util.Scanner;
public class prb6
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    double y= 0;
    for(double i=1;i<=n;i++)
    { 
      if (i!=2 && i%4==0)
      {
      y-= 1/i;
      //System.out.println(y); 
      }
      else
      {
      y += 1/i;
      //System.out.println(y); 
      }
    }
    System.out.printf("Y=%.4f\n",y); 
  }
}