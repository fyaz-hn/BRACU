//task8 
import java.util.Scanner;
public class task8
{
  public static void main(String[]args)
  {
   Scanner sc= new Scanner(System.in);
   String input= sc.nextLine();
   char inch;
   int count=0;
   for (int i=0; i<=input.length()-1; i++)
   {
    inch=input.charAt(i);
    if(count%2==0)
    {
    System.out.print(Character.toLowerCase(inch));
    }
    else
    {
    System.out.print(Character.toUpperCase(inch));
    }
    if(inch>=65 && inch<=90 || inch>=97 && inch <=122) 
    {
    }
    else
    {
    count++;
    }
    count++;
   }
  }
}