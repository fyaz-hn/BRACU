import java.util.Scanner;
public class task10
{
  public static void main(String[]args)
  {
   Scanner sc=new Scanner(System.in);
   double t= convertToCm(sc.nextDouble());
   System.out.printf("%.2f cm\n",t);
   
   double [] cheetos_inches = new double[]{10.0, 12.0, 14.0, 16.0, 18.0};
   double averageLength = findAvgCm(cheetos_inches);
   System.out.printf("The average Cheeto length is %.2f cm",averageLength);  
  }
  //A
  public static double convertToCm(double cm)
  {
   cm*=2.54;
   return cm;
  }
 //B
  public static double findAvgCm(double [] avgcm)
  {
   double inch=0; 
   for (int i=0; i<=avgcm.length-1; i++)
   {
    inch +=convertToCm(avgcm[i]);
   }
   inch/=avgcm.length;
   return inch;
  }
}
