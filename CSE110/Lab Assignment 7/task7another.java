//task7another
import java.util.Arrays;
public class task7another
{
 public static void main(String[]args)
 {
   int []arr1= {23,100,23,56,100};
   int []arr2= new int[arr1.length];//23,0,0,0,0
   int index2=0;
   System.out.println("Input array:");
   for (int i=0; i<=arr1.length-1; i++)
   {
   System.out.print(arr1[i]+" ");
   }
   System.out.println();
   System.out.println("New Array:");
   for(int i=0; i<=arr1.length-1; i++)//0,1,2,3
   { 
    boolean check= false;
    for (int j=i; j>=0; j--)//0,(1,0),(2,1,0),(3,2,1,0)
    {
     if(arr1[i]==arr2[j] && i!=j)//23!=0,0!=23,23=23,
     {
      check=true;
     }
    }
    if (check==false)
    {
    arr2[index2]=arr1[i];//0=23,0=0,
    System.out.print(arr2[index2]+" ");//23
    index2++;//1,2,3
    }
   }
 }
}
   
   
   
   