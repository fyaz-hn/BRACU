//task5
import java.util.Scanner;
public class task5
{
  public static void main(String[]args)
  {
   Scanner sc= new Scanner(System.in);
   String s1= sc.nextLine(); 
   int vowel=0;
   int consonant=0;
   for (int i=0; i<=s1.length()-1;i++)
   {
    String ch="";
    ch+=s1.charAt(i);
    int chcode=ch.codePointAt(0);
    if(chcode>=65 && chcode<=90 || chcode>=97 && chcode<=122)
    {
     if(ch.equalsIgnoreCase("A")||ch.equalsIgnoreCase("E"))
     {
     vowel++;
     }
     else if(ch.equalsIgnoreCase("I")||ch.equalsIgnoreCase("O"))
     {
     vowel++;
     }
     else if(ch.equalsIgnoreCase("U"))
     {
     vowel++;  
     }    
     else
     {
     consonant++;
     }
    }
   }
   if(vowel>0 && consonant>0 && vowel%3==0 && consonant%5==0)
   {
    System.out.println("Aaarr! Me Plunder!!");
   }
   else
   {
    System.out.println("Blimey! No Plunder!!");
   }
  }
}