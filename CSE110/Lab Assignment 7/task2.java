//task2
import java.util.Arrays;
public class task2
{
  public static void main(String[]args)
  {
    int [] arr= new int[]{9,-5,7,9,-5,5,7};
    System.out.println("Before removing duplicates:"); 
    for(int k=0; k<=arr.length-1; k++)
    {
    System.out.print(arr[k]+" ");
    }
    System.out.println();
    for(int i=0; i<=arr.length-1; i++)
    {
      for(int j=0; j<=arr.length-1; j++)
      {
        if (arr[i]==arr[j] && i!=j)
        {
          arr[j]=0;
        }
      }
    }
    System.out.println("After replacing duplicates with 0:");   
    for(int m=0; m<=arr.length-1; m++)
    {
    System.out.print(arr[m]+" ");
    }
    System.out.println();
  }
}
        
      