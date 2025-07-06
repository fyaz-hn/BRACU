import java.util.Scanner;
public class prb11
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    int sum=0;
    int count=0;
    int num= sc.nextInt();
    for(int i=1; i<=num; i++)
    {  
     int num2= sc.nextInt();
     if (num2%2==0 && num2>0)
     {
      int numa=num2; 
      if(numa>num2)
      {
       System.out.println("Max:"+numa); 
      }
      else if(num2>numa)
      {
       System.out.println("Max:"+num2); 
      } 
      count++;
      sum+=num2;
     }
    }
    //System.out.println("Max:");
    //System.out.println("Min:");
    System.out.println("Average:"+sum/count);
  }
}
//not done