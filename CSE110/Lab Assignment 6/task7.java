//task7
import java.util.Scanner;
public class task7
{
  public static void main(String[]args)
  {
   Scanner sc= new Scanner(System.in);
   String low1= sc.nextLine();
   String low2= sc.nextLine();
   for(int i=0; i<=low1.length()-1; i++)
   {
   String low1ch="";
   low1ch+=low1.charAt(i);
   int count=0; 
    for (int j=0; j<=low2.length()-1;j++)
    {
     String low2ch="";
     low2ch+=low2.charAt(j);
     if(low1ch.equals(low2ch))
     { 
     count++;
     //System.out.println(count+" "+low1ch);  
     }
     //System.out.println(count+" "+low1ch);
    }
    if(count==0)
    {
    System.out.print(low1ch.toUpperCase());  
    } 
   }  
   for(int m=0; m<=low2.length()-1; m++)
   {
   String low3ch="";
   low3ch+=low2.charAt(m);
   int count2=0; 
    for (int n=0; n<=low1.length()-1;n++)
    {
     String low4ch="";
     low4ch+=low1.charAt(n);
     if(low3ch.equals(low4ch))
     { 
     count2++;
     //System.out.println(count+" "+low1ch);  
     }
     //System.out.println(count2+" "+low3ch);
    }
    if(count2==0)
    {
    System.out.print(low3ch.toUpperCase());  
    } 
   }
  }
}

     /*if(low2ch.equals(low1ch))
     { 
      count2++;
    // System.out.println(low2ch);  
     }
     //System.out.println(low2ch+" "+count2);
     if (count2==0)
     {
      int count3=0;
      //System.out.println(low2ch+" "+count2);
      for(int k=0; k<=low2.length()-1;k++)
      {
       String low2k="";
       low2k+=low2.charAt(k);
       if (low2ch.equals(low2k))
       {
       count3++;  
       System.out.println(low2ch+" "+count3+" "+low2k);
      //System.out.println(low2k);
       }
      }
     }
     //System.out.println(low2ch+" "+count2);*/
   
 
