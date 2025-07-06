//Task12
import java.util.Scanner;
public class Task12
{
  public static void main(String[]args)
 {
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter the amount the customer need to pay(Taka): ");
    int num1= sc.nextInt();
    System.out.println("Enter the amount, customer gave(Taka): ");
    int num2= sc.nextInt();
    if (num2>num1)
    {
        int num3= num2-num1;
        int tk100= num3/100;
        int rem100=num3%100;
        int tk50=rem100/50;
        int rem50=rem100%50;
        int tk20= rem50/20;
        int rem20=rem50%20;
        int tk10=rem20/10;
        int rem10=rem20%10;
        int tk5= rem10/5;
        int rem5=rem10%5;
        int tk2=rem5/2;
        int rem2=rem5%2;
        int tk1= rem2/1;
        int rem1=rem2%1; 
        System.out.print( "The returned amount is "+num3); 
        System.out.println(" Taka");
        System.out.println("100 Taka note:"+tk100);
        System.out.println("50 Taka note:"+tk50);
        System.out.println("20 Taka note:"+tk20);
        System.out.println("10 Taka note:"+tk10);
        System.out.println("5 Taka coin:"+tk5);
        System.out.println("2 Taka coin:"+tk2);
        System.out.println("1 Taka coin:"+tk1);      
    }
    else if(num2<num1)
    {
    System.out.print("Please pay "+(num1-num2)+" Taka more");  
    }
    else if (num1==num2)
    {
      System.out.println("The returned amount is 0 Taka");
    }
   sc.close();
 }
}
    