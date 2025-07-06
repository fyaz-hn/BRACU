//Task 3
import java.util.Scanner;
public class Task3 
{
  public static void main(String[]args)
  { 
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter First Number :");
   int num1= sc.nextInt();
   System.out.println("Enter Second Number :");
   int num2= sc.nextInt();
   System.out.println("Enter Operator :");
   String operator= sc.next();
   if(operator.equals("+"))
   {
     System.out.println(num1+num2);
   }
   else  if(operator.equals("-"))
   {
     System.out.println(num1-num2);
   }
   else if(operator.equals("*"))
   {
     System.out.println(num1*num2);
   }
   else if(operator.equals("/"))
   {
     System.out.println(num1/num2);
   }
  sc.close(); 
 }
}