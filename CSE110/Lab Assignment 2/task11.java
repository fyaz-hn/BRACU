//Task 11 
public class task11 
{
  public static void main (String[]args) 
  {
    double a = 4.5; 
    double b = 9.5;
    double c = Math.sqrt(a*a+b*b); // Using pythagorus formula
    
    System.out.printf("sin(A) = %.2f\n",a/c);
    System.out.printf("sin(B) = %.2f\n",b/c);
    System.out.printf("cos(A) = %.2f\n",b/c);
    System.out.printf("cos(B) = %.2f\n",a/c);
  
  }
}