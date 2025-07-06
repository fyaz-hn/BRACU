import java.util.Scanner;
public class prb7
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int y=1;
    for (int i=1; i<=n; i++)
    { 
      if (n==1)
      {
       y=3; 
      }
      else if (n==2)
      {
       y=-2;
      }
      else if (n==3)
      {
       y=5;
      }
      else
      {
      y+=2;      
      System.out.println(y);
      if (i%2==0)
      {
       y-=y; 
       System.out.println(y);
      }
      else 
      {
       y+=y; 
       System.out.println(y);
      }
      y+=2;
      System.out.println(y);
      }//System.out.println(y);
    }  
  }
}
//Not done