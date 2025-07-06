//task1
import java.util.Scanner;
public class task1
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    int N=sc.nextInt();
    int Ncount=0;
    int num=1;
    for(;;)
    {
     int count=0; 
     for(int i=1;i<=num;i++)
     {
      if(num%i==0)
      {
       count++;
      }
      //System.out.println(num+" "+i+" "+count);
     }
     if (count==2)
     {
      Ncount++;
      System.out.println(num);
     }
     num++;
     if (Ncount==N)
     {
     break;
     }
    }
  }
}
    
    
     /*for(int i=1;i<=num;i++)
     {
      if (num%i==0)
      {
      count++;
      }
      
      System.out.println(count);
      if (count==2)
      {
      Ncount++; 
      }
     }
    // num++;
    // System.out.println(num);
    if (Ncount==N)
    {
    break;
    }*/
  
 