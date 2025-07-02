//task6
import java.util.Scanner;
public class task6
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("N = ");
    int N=sc.nextInt();
    int arr[]=new int[N];
    System.out.println("Enter numbers = ");
    for(int i=0;i<N;i++)
    {
    arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i++)//6,15,14,15,6
    {
     int count=0;
     for(int j=0;j<arr.length;j++)
     {
      if (arr[i]==arr[j])//0-0,0-1,0-2,0-3,0-4
      {
       count++;
       if(i!=j)
       {
        arr[j]=0;
       }
      }
     }
     if(arr[i]!=0)
     {
     System.out.println(arr[i]+" - "+count+" times");
     } 
    }
  }
}
     