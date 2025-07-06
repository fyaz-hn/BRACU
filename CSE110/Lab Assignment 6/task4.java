//task4
import java.util.Scanner;
public class task4
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    String s1= sc.nextLine();
    String rev="";
    for(int i= s1.length()-1; i>=0;i--)
    {
      rev+=s1.charAt(i);
    }
    System.out.println(rev);
  }
}