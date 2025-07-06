//task7
import java.util.Arrays;
public class task7
{
 public static void main(String[]args)
 {
  int []arr1= new int[]{-5,5,-7,-5};
  int count=0;
  System.out.println("Input array:");
  for (int i=0; i<=arr1.length-1; i++)
  {
   System.out.print(arr1[i]+" ");
  }
  System.out.println();
  for (int i=0; i<=arr1.length-1; i++)
  {
   count++;
   for (int j=0; j<=arr1.length-1;j++)
   { 
     if (arr1[i]==arr1[j] && i!=j)
      {
       arr1[j]=0;
      }
   }      
  }
  for (int i=0; i<=arr1.length-1; i++)
  {
   if(arr1[i]==0)
   {
    count--;
   }
  }
  int []arr2=new int[count];
  int j=0;
  for(int i=0; i<=arr1.length-1; i++)
  { 
   if(arr1[i]!=0)
   {    
    arr2[j]=arr1[i];
    j++;
   }
  }
  System.out.println("New Array:");
  for (int i=0; i<=arr2.length-1; i++)
  {
   System.out.print(arr2[i]+" ");
  }    
 }
}