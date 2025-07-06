//task6
import java.util.Scanner;
public class task6
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    int row= sc.nextInt();
    int space=row-1;
    int num=row-space;
    for(int i=1; i<=row; i++)
    {
      for (int k=1; k<=space;k++)
      {
      System.out.print(" ");
      }
      for(int j=1; j<=num;j++ )
      { 
      System.out.print(j); 
      }
      System.out.println();
      space--;
      num++;
    }
  }
}