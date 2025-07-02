//task5
public class TaxiLagbe
{
 public String taxnum; 
 public String name="";
 public String area;
 public int fare;
 public int tpass;
 public void storeInfo(String info,String loc)
 {
  taxnum=info;
  area=loc;
 }
 public void printDetails()
 {
 System.out.println("Taxi number: "+taxnum);
 System.out.println("This taxi can cover "+area+" area");
 System.out.println("Total Passenger: "+tpass);
 if(tpass==0)
 {
 System.out.println("Passenger Lists: "+name);
 }
 else
 {
 System.out.println("Passenger Lists: \n"+name);
 }
 System.out.println("Total collected fare: "+fare+" Taka");
 }
 public void addPassenger(String p1,int f1)
 {
  tpass++; 
  if (tpass>4)
  {
  tpass--;
  System.out.println("Taxi Full! No more passengers can be added");
  }
  else 
  {
  name+=p1+" ";
  fare+=f1;
  System.out.println("Dear "+p1+"! Welcome to TaxiLagbe");
  }
 }
 public void addPassenger(String p1,int f1,String p2,int f2)
 {
  tpass+=2; 
  if (tpass>4)
  {
  tpass--;
  name+=p1+" ";
  fare+=f1;
  System.out.println("Dear "+p1+"! Welcome to TaxiLagbe");
  System.out.println("Taxi Full! No more passengers can be added");
  }
  else 
  {
  name+=p1+" "+p2+" ";
  fare+=f1+f2;
  System.out.println("Dear "+p1+"! Welcome to TaxiLagbe\nDear "+p2+"! Welcome to TaxiLagbe");
  }
 }
}