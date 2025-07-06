//task3
import java.util.Scanner;
import java.util.Arrays;
public class task3
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the length of the array: ");
    int length= sc.nextInt();
    int []arr1= new int[length];
    int []arr2= new int[length];
    for (int i=0; i<=arr1.length-1; i++)
    {
      System.out.println("Enter a number: ");
      arr1[i]=sc.nextInt();
    }
    int arid=0;
    for (int j=arr2.length-1; j>=0; j--)
    { 
     arr2[j]=arr1[arid];
     arid++;
    }
    //3a 
    System.out.println("Reversed using a new array:");
    for(int i=0; i<=length-1; i++)
    {
    System.out.print(arr2[i]+" ");
    }
    System.out.println();
    //3b
    int revind=arr1.length-1;
    int revstop=length/2;
    for(int i=0; i<revstop; i++)
    {
    int temp=0;
    temp=arr1[revind]; //100,97
    arr1[revind]=arr1[i];//4-7,3-(-31),
    arr1[i]=temp;//0-100,1-97,
    revind--;//4,3,2
    }
    //3b
    System.out.println("Reversed the original array:");
    for(int i=0; i<=length-1; i++)
    {
    System.out.print(arr1[i]+" ");
    }
    System.out.println();
  }
}
      
