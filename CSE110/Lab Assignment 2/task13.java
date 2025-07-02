//Task 13
public class task13 
{
  public static void main (String[]args) 
  { 
    double distance_metre = 1027; //Taking last 4 digits of my id as double
    double time = 5.0+(56.0/60.0)+(23.0/3600.0); //Turning 5 hours 56 mins and 23 secs into hours as 1hour= 60 mins and 3600 secs 
    double velocity = distance_metre/time; //we get velocity in metre/h
    double kmh = velocity/1000; //velocity is  converted into km/h
    double milesh = velocity/1609; //velocity is converted into miles/h
  
    System.out.printf("Velocity in km/h is %.2f\n",kmh); 
    System.out.printf("Velocity in miles/h is %.2f\n",milesh); 
  }
}