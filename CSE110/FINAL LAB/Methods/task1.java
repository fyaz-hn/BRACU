import java.util.Scanner;
public class task1
{
  public static void main(String[]args)
 {
  Scanner sc= new Scanner(System.in);
  evenChecker(sc.nextInt());
  boolean resulteven= isEven(sc.nextInt());
  System.out.println(resulteven);
  boolean resultpos= isPos(sc.nextInt());
  System.out.println(resultpos);
  sequence(sc.nextInt());
 }
  //A
 public static void evenChecker(int n1)
 {
  if (n1%2==0)
  {
  System.out.println("Even!!"); 
  }
  else
  {
  System.out.println("Odd!!"); 
  }
 }
 //B
 public static boolean isEven(int b1)
 {
  boolean result=false;
  if (b1%2==0)
  {
  result=true;
  } 
  return result;
 }
 //C
  public static boolean isPos(int num )
 {
   boolean result=false;
   if (num>0)
   {
   result=true;  
   }
   return result;
 }
  //D
  public static void sequence(int num)
  { 
   if (isPos(num)==true)
   {
    for(int i=0;i<=num;i++)
    {
     if(isEven(i)==true) 
     {
     System.out.print(i+" ");
     }
    }
   }
   else
   {
    for(int i=num;i<=-1;i++)
    {
     if(isEven(i)==false) 
     {
     System.out.print(i+" ");
     }
    }
   }
  }
}
  