import java.util.Scanner;
public class prb10
{
 public static void main(String[]args)
 {
    Scanner sc= new Scanner(System.in);
    int num= sc.nextInt();
    int numa= num;
    int numb= num;
    int numc=0;
    double numd=0;
    int nume=0;
    int count= 0;
    int sum= 0;
    for(;;)
    {
     numa/=10;
     count++;
     if (numa==0)
     {
     break;
     }
    }
    double pownum= count-1;
    double power= Math.pow(10,pownum);
    int power2= (int)power;
    for (;;)
    {
     numc=numb/power2;
     numb%=power2;
     numd=numc*Math.pow(2,pownum);
     nume=(int)numd;
     sum+=nume;
     power2/=10;
     pownum-=1;   
     if (power2==0)
     {
     break;
     }  
    }
    System.out.println(sum);
    sc.close();
 }
}
