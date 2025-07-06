//Task 10 
import java.util.Scanner;
public class task10 
{
 public static void main(String[]args)
 {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Number : ");
    int num= sc.nextInt();
    int numa=num;
    int numb=num;
    int count=0;
    int num1=1;
    while(true)
    {
     numa/=10;
     count++;
       if(numa==0)
      {
       break;
      }
    }
     int pownum= count-1;
     double power=Math.pow(10,pownum);
     int power2=(int)power;
    
     while(true)
     {
      num1 = (numb/power2);
      numb%= power2;
      power2 /=10;
      System.out.print(num1+",");
      if (power2==1)
      {
        break;
      }
     }
     numb /= power2;
     System.out.print(numb);
 }
}