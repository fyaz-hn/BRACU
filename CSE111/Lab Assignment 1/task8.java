//task8
import java.util.Scanner;
public class task8
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("row = ");
    int row=sc.nextInt();
    sc.nextLine();
    System.out.println("column = ");
    int col=sc.nextInt();
    int arr2d[][]=new int[row][col];
    int idx=0;
    int arr[]=new int[row*col];
    System.out.println("Enter numbers : ");
    for(int i=0; i<row; i++)
    {
     for(int j=0; j<col; j++)
     {
      arr2d[i][j]=sc.nextInt();
      arr[idx]=arr2d[i][j];
      idx++;
     }     
    }
    System.out.println("2D Array: ");
    for(int i=0; i<row; i++)
    {
     for(int j=0; j<col; j++)
     {
      System.out.print(arr2d[i][j]+" ");
     }
     System.out.println();
    }
    System.out.println("1D Array:");
    for(int i=0; i<arr.length;i++)
    {
     System.out.print(arr[i]+" "); 
    }
  }
}