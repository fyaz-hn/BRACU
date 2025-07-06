//task7
import java.util.Scanner;
public class task7
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    int row= sc.nextInt();
    int space=row-1;
    int num2=0;
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
      num2=j;
      }
      if(i>1)
      {
       for(int m=1; m<=num-1; m++)
       {
        num2++;
        System.out.print(num2);
       }
      }
      System.out.println();
      space--;
      num++;
    }
  }
}