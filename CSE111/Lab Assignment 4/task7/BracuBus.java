//task7
public class BracuBus
{
 public String loc,pass[];
 public int maxpass=2,count;
 public BracuBus(String loc)
 {
  this.loc=loc;
  pass=new String[maxpass];
 }
 public BracuBus(String loc,int maxpass)
 {
  this.loc=loc;
  this.maxpass=maxpass;
  pass=new String[maxpass];
 }
 public void showDetails()
 {
  System.out.println("Bus Route: "+loc);
  System.out.println("Passenger Count: "+count+" (Max: "+maxpass+")");
  System.out.println("Passenger on Board: ");
  for(int i=0;i<pass.length;i++)
  {
   if(pass[i]!=null)
   {
   System.out.print(pass[i]+" ");
    if(i==pass.length-1)
    {
     System.out.println();
    }
   }
  }
 }
 public void board()
 {
  System.out.println("No Passengers");
 }
 public void board(BracuStudent std)
 {
  if(count<maxpass) 
  {
   if(std.pass==false)
   {
    System.out.println("You don't have a buss pass!");
   }
   else if(loc.equals(std.loc))
   {
    pass[count]=std.name;
    count++;
    System.out.println(std.name+" boarded the bus.");
   }
   else
   {
    System.out.println("You got on the wrong bus!");
   }
  }
  else
  {
   System.out.println("Bus is full!");
  } 
 }
 public void board(BracuStudent std,BracuStudent std1)
 {
  board(std);
  board(std1);
 }
}


//  if(count<maxpass) 
//  {
//   if(std.pass==false)
//   {
//    System.out.println("You don't have a bus pass!");
//   }
//   else if(loc.equals(std.loc))
//   {
//    pass[count]=std.name;
//    count++;
//    System.out.println(std.name+" boarded the bus.");
//   }
//   else
//   {
//    System.out.println("You got on the wrong bus!");
//   }
//  }
//  else
//  {
//   System.out.println("Bus is full!");
//  } 
//  if(count<maxpass) 
//  {
//   if(std1.pass==false)
//   {
//    System.out.println("You don't have a bus pass!");
//   }
//   else if(loc.equals(std1.loc))
//   {
//    pass[count]=std.name;
//    count++;
//    System.out.println(std1.name+" boarded the bus.");
//   }
//   else
//   {
//    System.out.println("You got on the wrong bus!");
//   }
//  }
//  else
//  {
//   System.out.println("Bus is full!");
//  } 