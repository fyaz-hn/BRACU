//task2
public class Passenger
{
 public String name;
 public double fr;
 public static int no_of_passenger;
 public static double total_fare;
 public Passenger ()
 {}
 public Passenger (String name,double dis)
 {
  this.name=name;
  no_of_passenger++;
  total_fare+=20*dis;
  fr+=20*dis;
 }
 public void passengerDetails()
 {
  System.out.println("Name "+name);
  System.out.println("Fare "+fr+" TK");
 }
 public void storeBaggageWeight(double wgt)
 {
  total_fare+=10*wgt;
  fr+=10*wgt;
 } 
}
