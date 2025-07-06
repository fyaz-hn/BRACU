//task4
import java.util.Scanner;
public class task4
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("N = ");
    int N=sc.nextInt();
    int [] arr=new int[N];
    for (int i=0; i<=arr.length-1; i++)
    {
    arr[i]=sc.nextInt();
    }
    System.out.println("Original array:");
    for(int k=0; k<=arr.length-1; k++)
    {
    System.out.print(arr[k]+" ");
    }
    for (int j=0; j<=arr.length-1; j++)
    {
      if(arr[j]>0)
      {
      arr[j]=1;
      }
      else if (arr[j]<=0)
      {
      arr[j]=0;
      }
    }
    System.out.println();
    System.out.println("After modifying:");
    for(int m=0; m<=arr.length-1; m++)
    {
    System.out.print(arr[m]+" ");
    }
  }
}