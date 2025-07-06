//task2
import java.util.Scanner;
public class task2
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    String s1= sc.nextLine();
    String rev="";
    for(int i=s1.length()-1; i>=0; i--) //i= 4,3,2,1,0
    {
    rev+=s1.charAt(i);
    //System.out.println(rev); //output true why???    
    }
    System.out.println(s1.equals(rev));
  }
}
    /* System.out.println(s1.charAt(i));
     String s2=s1.charAt(i);
     //String s3=s1.charAt();
     if(s2.equalsIgnoreCase(s3))
     {
     System.out.println(s1.length());
     }*/