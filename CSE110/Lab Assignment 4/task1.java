//Task1 
//1(a)
public class task1
{
  public static void main(String[]args)
  {
    int i=30;
    while (i>0)
    {
     i-=6;
     System.out.print(i+",");
    }
    System.out.println(i-=6);    
    
//1(b)

  int i2=-15;
    while (i2<15)
    {
     i2+=5;
     System.out.print(i2+",");
    }
    System.out.print(i2+=5);    
  }
}
//code After completing CSE110
/*Task1
//1(a)
public class task1
{
  public static void main(String[]args)
  {
    for (int i= 24; i>=0; i-=6)
    { 
      System.out.print(i+",");
      if(i==0)
      {
       System.out.println(i-6);
      }
    }
    
//1(b)

    for (int i= -10; i<=15; i+=5)
    {  
      System.out.print(i+",");
      if (i==15)
      {
      System.out.println(i+5);
      }
    }
  }
}*/