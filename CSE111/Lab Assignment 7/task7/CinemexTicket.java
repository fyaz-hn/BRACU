//task7code
public class CinemexTicket extends MovieTicket
{
 public static int totaltickets;
 public boolean payment=false;
 public String Genre,ticketid, tmparts[]=super.showtime.split(":");
 public int time=Integer.parseInt(tmparts[0]);
 public CinemexTicket(String movie,String showtime,String Genre,String date)
 {
  super(movie,date,showtime,300);
  this.Genre=Genre;
  super.seat="Regular";
  totaltickets++;
  ticketid=movie+"-"+"R"+"-"+totaltickets;
 } 
 public CinemexTicket(String movie,String showtime,String Genre,String date,String seat)
 {
  super(movie,date,showtime,0);
  this.Genre=Genre;
  super.seat=seat;
  totaltickets++;
  ticketid=movie+"-"+super.seat.charAt(0)+"-"+totaltickets;
 }
 public void calculateTicketPrice()
 {
  if(time>17 &&  time<24)
  {
   super.setPrice(super.getPrice()+super.getPrice()*15.0/100);
   System.out.println("Ticket price is calculated successfully.");
  }
  else
  { 
   for(int i=0;i<seatTypes.length;i++)
   {
    if(super.seat.equals(super.seatTypes[i]))
    {
    super.setPrice(seatPrices[i]);
    }
   }
   System.out.println("Ticket price is calculated successfully.");
  }
 }
 public static int getTotalTickets()
 {
  return totaltickets;
 }
 public String confirmPayment()
 {
  if(payment==false)
  {
   payment=true;
   return "Payment Successful.";
  }
  else
  {
   return"Ticket price is already paid!";
  }
 }
 public String toString()
 {
  System.out.println("Ticket ID: "+ticketid);
  System.out.print(super.toString());
  System.out.println("\nGenre: "+Genre);
  System.out.println("Seat Type: "+super.seat);
  System.out.println("Price(tk): "+super.getPrice());
  if(payment==true)
  {
  System.out.print("Status: Paid");
  }
  else
  {
  System.out.print("Status: Not Paid");
  }
  return"";
 }
}