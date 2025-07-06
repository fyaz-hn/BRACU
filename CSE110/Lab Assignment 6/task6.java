//task6
import java.util.Scanner;
public class task6
{
  public static void main(String[]args)
  {
   Scanner sc= new Scanner(System.in);
   String input= sc.nextLine();
   String space="";
   for(int i=input.length()-1; i>=0; i--)
   {  
    space=input.charAt(i)+space;
    if (i==0)
    {
    space=" "+space;
    }
    if(input.codePointAt(i)==32 || i==0)
    { 
     System.out.print(space);
     space="";
    } 
   }
  }
} 