//Task6
public class task6 
{
  public static void main(String[]args)
  { 
   //Task 6a
    int num1= 5;
    int num2= 7;
    int temp; //Declaring a third variable to swap variable 
      temp=num1;  
      num1=num2;
      num2=temp;
      
     System.out.println(num1);
     System.out.println(num2);
    
   //Task 6b 
     int num3=10;
     int num4=12;
     num3=num3+num4; // 10+12=22
     num4=num3-num4; // 22-12=10
     num3=num3-num4; // 22-10=12
     System.out.println(num3);
     System.out.println(num4);
  }
}