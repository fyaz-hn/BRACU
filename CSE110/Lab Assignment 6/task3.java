//task3
import java.util.Scanner;
public class task3
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    String input=sc.nextLine();
    String chsplit= sc.nextLine();    
    for (int i=0; i<=input.length()-1; i++)
    { 
      String s="";
      s+=input.charAt(i);
      if (s.equals(chsplit))
      {
      System.out.println();
      }
      else
      {
      System.out.print(s);
      }
    }
  }
}