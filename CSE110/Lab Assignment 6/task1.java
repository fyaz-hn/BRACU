//task1
import java.util.Scanner;
public class task1
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    String s1= sc.nextLine();
    for(int i=0; i<=s1.length()-1; i++)
    {
     if (s1.codePointAt(i)>=97 && s1.codePointAt(i)<=122)
     {
     int cap= s1.codePointAt(i)-32;
     System.out.print((char)cap);
     }
     else
     {
      System.out.print(s1.charAt(i)); 
     }
    }   
  }
}