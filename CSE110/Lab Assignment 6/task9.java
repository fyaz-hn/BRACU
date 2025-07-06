//task9
import java.util.Scanner;
public class task9
{
  public static void main(String[]args)
  {
   Scanner sc= new Scanner(System.in);
   String pass= sc.nextLine();
   int up=0;
   int low=0;
   int dig=0;
   int special=0;
   if (pass.length()>=8)
   {
    for (int i=0; i<=pass.length()-1; i++)
    {
     String passch="";
     passch+=pass.charAt(i);
     int passcode=passch.codePointAt(0); //flag-boolean 
     if(passcode>=65 && passcode<=90)
     {
     up++;
     }
     else if(passcode>=97 && passcode<=122)
     {
     low++;
     }
     else if(passcode>=49 && passcode<=57)
     {
     dig++;
     }
     else
     {
     special++;
     }
    }
    if(up>0 && low>0 && dig>0 && special>0)
    {
    System.out.println("True");
    }
    else
    {
    System.out.println("False");
    }
   }
   else
   {
   System.out.println("False"); 
   }
  }
}