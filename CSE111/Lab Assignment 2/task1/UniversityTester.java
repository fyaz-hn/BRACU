//task 1
public class UniversityTester
{
  public static void main(String[]args)
  {
    //1a
    University u1=new University();
    University u2=new University();
    System.out.println(u1==u2); //Output will be false so location is different.
    System.out.println(u1);
    System.out.println(u2);
    System.out.println(u1.name);
    System.out.println(u1.country);
    System.out.println(u2.name);
    System.out.println(u2.country);
    //1b
    u1.name="Imperial College London";
    u1.country="England";
    u2.name="Brac University";
    u2.country="Bangladesh";
    System.out.println(u1.name);
    System.out.println(u1.country);
    System.out.println(u2.name);
    System.out.println(u2.country);
    //Instance variables of both objects were null at first and then it will be changed
  }
}