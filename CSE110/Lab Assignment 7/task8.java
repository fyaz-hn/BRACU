//task8
import java.util.Scanner;
public class task8
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Please enter the length of array 1:");
    int length1=sc.nextInt();
    int []arr1= new int[length1];
    System.out.println("Please enter the elements of arr1:");
    for(int i=0; i<=arr1.length-1; i++)
    {
      arr1[i]=sc.nextInt();
    }
    System.out.println("Please enter the length of array 2:");;
    int length2=sc.nextInt();
    int []arr2= new int[length2];
    int count=0;
    System.out.println("Please enter the elements of arr2:");
    for (int j=0; j<=arr2.length-1; j++)
    {
      arr2[j]=sc.nextInt();
      for(int k=0; k<=arr1.length-1; k++)
      {
       boolean check=false;
       if (arr2[j]==arr1[k])
       {
       check=true;
       //break;
       }
       //System.out.println(check);
       if(check==true)
       {
       count++;
       //System.out.println(count);
       }
      }
    }
    if (count==length2)
    {
    System.out.println("Array 2 is a subset of Array 1");
    }
    else
    {
    System.out.println("Array 2 is not a subset of Array 1");
    }
  }
}
         

      