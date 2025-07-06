//task6
import java.util.Scanner;
public class task6
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the length of the array: ");
    int length=sc.nextInt();
    double []arr= new double[length];
    double max=0;
    double min=0;
    double sum=0;
    int countmax=0;
    int countmin=0;
    for(int i=0; i<=arr.length-1; i++)
    {
      System.out.println("Enter a number: ");
      arr[i]=sc.nextDouble();
      sum+=arr[i];
      if (arr[i]>max)
      {
      max=arr[i];
      countmax=i;
      }
      if(arr[i]<min)
      {
      min=arr[i]; 
      countmin=i;
      }
    }
    //6a
    System.out.println("Maximum element "+max+" found at index "+countmax);
    //6b
    System.out.println("Minimum element "+min+" found at index "+countmin);
    //6c
    System.out.println("Summation: "+sum);
    //6d
    System.out.printf("Average: %.2f\n",sum/length);
  }
}
      
      
        