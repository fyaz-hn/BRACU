import java.util.Scanner;
public class prb2
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    int item= sc.nextInt();
    int qnt= sc.nextInt();
    if (item==1)
    { 
     System.out.println("Item: Hot dog");
     System.out.println("Quantity: "+qnt);
     System.out.println("Total: $"+ 4.00*qnt);
    }
    else if (item==2)
    { 
     System.out.println("Item: X-Salad");
     System.out.println("Quantity: "+qnt);
     System.out.println("Total: $"+ 4.50*qnt);
    }
    else if (item==3)
    { 
     System.out.println("Item: X-Bacon");
     System.out.println("Quantity: "+qnt);
     System.out.println("Total: $"+ 5.00*qnt);
    }
    else if (item==4)
    { 
     System.out.println("Item: Toast");
     System.out.println("Quantity: "+qnt);
     System.out.println("Total: $"+ 2.00*qnt);
    }
    else if (item==5)
    { 
     System.out.println("Item: Soda");
     System.out.println("Quantity: "+qnt);
     System.out.println("Total: $"+ 1.50*qnt);
    }
  }
}