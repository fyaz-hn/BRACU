import java.util.Scanner;
public class prb1
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    int distance= sc.nextInt();
    double litre= sc.nextDouble();
    System.out.printf("%.3f",distance/litre); //printf e variable er por "" string newa jabe na?
    System.out.println(" km/l");
  }
}
    