//task7 
import java.util.Scanner;
public class task7
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("N = ");
    int N=sc.nextInt();
    double arr1[]=new double[N];
    int newidx=0;
    System.out.println("Please enter the elements of the array: ");
    for(int i=0; i<N; i++)
    {
     arr1[i]=sc.nextDouble();
     int j=i-1;
     newidx++;
     if(j>=0 && arr1[i]==arr1[j])
     {
     newidx--;
     }    
    }
    double arr2[]=new double[newidx];
    System.out.print("New Array: ");
    for(int i=0,k=0,m=0;i<arr1.length;i++)
    {
     int j=i-1;
     if(j>=0)
     {
      arr2[m]=arr1[k];
      System.out.print(arr2[m]+" ");
      if(arr1[i]==arr1[j])
      {
       k++;
      }
      k++;
      m++;
      if(m>=arr2.length)
      {
      break;
      }
     }
    }
    System.out.println();
    System.out.println("Removed elements : "+(N-newidx));
  }
}

    