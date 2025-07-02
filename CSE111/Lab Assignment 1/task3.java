//task3
import java.util.Scanner;
public class task3
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    String s2=sc.nextLine();
    String newstr="";
    char ch;
    int sum=0;
    for(int i=0;i<s1.length();i++)
    {
     ch=s1.charAt(i);
     if(ch==' ')
     {
     break;
     }
     newstr+=ch;
    }
    newstr+=" ";
    for(int i=0;i<s2.length();i++)
    {
     ch=s2.charAt(i);
     if(ch==' ')
     {
     break;
     }
     newstr+=ch;
    }
    for(int i=0;i<newstr.length();i++)
    {
     ch=newstr.charAt(i);
     if(ch>=65 && ch<=90 || ch>=97 && ch<=122)
     {
     sum+=ch;
     }
    }
    System.out.println(newstr);
    System.out.println(sum);   
  }
}
    