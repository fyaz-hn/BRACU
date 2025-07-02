//Task 7
import java.util.Scanner; //Scanner is imported
public class task7 
{
  public static void main(String[]args)
  { Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number of minutes :");
    int num1= sc.nextInt(); //User inputs any number to convert into years and days
    int num2= num1/(60*24*365); // Dividing the number by (60*24*365) gives the number of years 
    int num3= num1%(60*24*365); // we mod  the number which provides us the remaining minutes 
      
    System.out.print(num1+ " minutes is approximately ");
    System.out.print(num2+ " years and "); 
    System.out.print(num3/(60*24)+ " days"); // Dividing the Remaining minutes by (60*24) we get the number of days 
 
  }
}