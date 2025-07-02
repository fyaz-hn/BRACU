//task2
public class NikeBD
{
  public String out;
  public static String pdt[]={"Jordan","Cortez","Kobe"};
  public int sold,qt[]=new int[3];
  public static int bch,tqt[]=new int[3],tsold;
  public NikeBD(String out)
  {
   bch++;
   this.out=out;
  }
  public static void status()
  {
   System.out.println("Nike Bangladesh Status:");
   System.out.println("Branches Opened: "+bch);   
   System.out.print("Currently Stocked: ");
   for(int i=0;i<3;i++)
   {
    if(i==2)
    {
    System.out.println(pdt[i]+": "+tqt[i]);
    }
    else
    {
    System.out.print(pdt[i]+": "+tqt[i]+", ");
    }
   }
   System.out.println("Sold: "+tsold);
  }
  public void details()
  {
   System.out.println("Nike "+out+" outlet:");
   System.out.print("Products Currently Stocked: ");
   for(int i=0;i<3;i++)
   {
    if(i==2)
    {
    System.out.println(pdt[i]+": "+qt[i]);
    }
    else
    {
    System.out.print(pdt[i]+": "+qt[i]+", ");
    }
   }
   System.out.println("Sold: "+sold);
  }
  public void restockProducts(String pdt,int qt)
  {
   for(int i=0;i<3;i++)
   {
    if(this.pdt[i].equals(pdt))
    {
     this.qt[i]+=qt;
     tqt[i]+=qt;
    }
   }
  }
  public void restockProducts(String pdt[],int qt[])
  {
   for(int i=0;i<3;i++)
   { 
    this.qt[i]+=qt[i];
    tqt[i]+=qt[i];
   }
  }
  public void productSold(String pdt1,int qt1,String pdt2,int qt2)
  {
   sold+=qt1+qt2;
   tsold+=qt1+qt2;
   for(int i=0;i<3;i++)
   {
    if(pdt[i].equals(pdt1))
    {
     qt[i]-=qt1;
     tqt[i]-=qt1;
    }
    else if(pdt[i].equals(pdt2))
    {
     qt[i]-=qt2;
     tqt[i]-=qt2;
    }
   }
  }
}