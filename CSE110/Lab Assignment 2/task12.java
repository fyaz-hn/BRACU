//Task 12
import java.util.Scanner;
public class task12 
{
  public static void main (String[]args) 
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter id");
    int num= sc.nextInt();
    int num1= num%100; // We mod the number by 100 and extract rightmost 2 digits
    int num2= num1%10; // We mod the extracted 2 digits by 10 and further extract the right digit
    int num3= num1/10; // We divide the extracted 2 digits by 10 and again extract the left digit
    System.out.println(num2);
    System.out.println(num3);
    
  }
}