//task1
import java.util.Scanner;
public class task1
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("N = ");
    int N=sc.nextInt();
    int [] arr=new int[N];
    for(int i=0; i<=arr.length-1; i++)
    {
      System.out.println("Enter a number: ");
      arr[i]=sc.nextInt();
    }   
    System.out.println("Enter another number: ");
    int num2=sc.nextInt();
    int []arr2= new int[N+1];
    //1a
    System.out.println("The elements of the array are:");   
    for(int j=0; j<=arr.length-1; j++)
    {
    arr2[j]=arr[j];
    System.out.println(j+": "+arr[j]);
    }
    //1b
    arr2[N]=num2;
    System.out.println("After resizing the array: ");
    for(int k=0; k<=arr2.length-1; k++)
    {
    System.out.print(arr2[k]+" ");
    }
    System.out.println();
  }
}