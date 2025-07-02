//task5
import java.util.Scanner;
public class task5
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the length of the array: ");
    int length=sc.nextInt();
    int arr[]=new int[length];
    for(int i=0;i<length;i++)
    {
     arr[i]=sc.nextInt();
    }
    int inplace=length/2;
    for(int i=0; i<=inplace;i++)
    {
     int temp=arr[i];//7,-31,344,97
     arr[i]=arr[length-1];//0=100,1=97,2=2,3=97
     arr[length-1]=temp;//[4]=7,3=-31,2=344,1=97
     length--;//4,3,2,1
    }
    for(int i=0; i<arr.length;i++)
    {
    System.out.print(arr[i]+" ");
    }
  }
}