import java.util.Scanner;
public class prb3
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    double x1= sc.nextDouble();
    double y1= sc.nextDouble();
    double x2= sc.nextDouble();
    double y2= sc.nextDouble();
    double distance= Math.pow(x2-x1,2)+Math.pow(y2-y1,2);
    double slope= (y2-y1)/(x2-x1);
    System.out.printf("Distance:%.4f\n",Math.sqrt(distance));
    System.out.printf("Slope:%.4f\n",slope);
    if (slope<0)
    { 
     System.out.println("The slope is Negative");
    }
    else if (slope>0)
    {
     System.out.println("The slope is Positive");
    }
    else if (slope==0)
    {
     System.out.println("The slope is Zero");
    }
  }
}