//task4
import java.util.Scanner;
public class task4
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    String input= sc.nextLine();
    String output="";
    char ch;
    for(int i=0;i<input.length();i++)
    {
     ch=input.charAt(i);
     if(ch==97)
     {
     ch=122; 
     }
     else
     {
     ch-=1;
     }
     output+=ch;
    }
    System.out.println(output);
  }
}