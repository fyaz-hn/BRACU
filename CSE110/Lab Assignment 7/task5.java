//task5
import java.util.Scanner;
import java.util.Arrays;
public class task5
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("N =");
    int N= sc.nextInt();
    int []arr= new int[N];
    int count=0;
    for(int i=0; i<=arr.length-1; i++)
    {
    System.out.println("Enter a number:");
    arr[i]= sc.nextInt();
    }
    System.out.println("Enter another number:");
    int num2=sc.nextInt();
    for (int j=0; j<= arr.length-1; j++)
    {
     boolean check=false;
     if (num2==arr[j])
     {
     check=true;
     count++;
     }
     if (check==true && count==1)
     {
     System.out.println(num2+" is at index "+j);
     }
    }
    if (count==0)
    {
    System.out.println("Element not found");
    }
  }
}