import java.util.Scanner;
public class task2
{
  public static void main(String[]args)
  {
   Scanner sc= new Scanner(System.in);
   double area= circleArea(sc.nextInt());
   System.out.printf("%.4f\n",area);
   double volume= sphereVolume(sc.nextInt());
   System.out.printf("%.4f\n",volume);
   int input=sc.nextInt();
   sc.nextLine();
   String inputstring=sc.nextLine();
   findSpace(input,inputstring);
   //2 bar string input nite hocche                                        
  }
  //A
  public static double circleArea(int num)
  {
  double area=Math.PI*num*num;
  return area;
  }
  //B 
  public static double sphereVolume(int num)
  {
  double volume=4*Math.PI*num*num*num/3;
  return volume;
  }
  //C
  public static void findSpace(int num,String s2)
  //2 bar string input nite hocche
  {
   if (s2.equalsIgnoreCase("circle"))
   {
   System.out.printf("%.4f\n",circleArea(num));
   } 
   else if (s2.equalsIgnoreCase("sphere"))
   {
   System.out.printf("%.4f\n",sphereVolume(num));
   }
   else
   {
   System.out.println("Wrong Parameter");
   } 
  }
}