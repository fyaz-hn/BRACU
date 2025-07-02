//task8
public class Player
{
 public static Player[] allpl=new Player[11]; //player class er array banai player store kora jabe??
 public String name,nation;
 public int jn;
 public static int total;
 public Player()
 {}
 public Player(String name,String nation,int jn)
 {
  if(total<11)
  {
  allpl[total]=this;
  total++;
  this.name=name;
  this.nation=nation;
  this.jn=jn;
  }
 }
 public String player_detail()
 {
  System.out.println("Player Name: "+this.name);
  System.out.println("Jersey Number: "+this.jn);
  System.out.print("Country: "+this.nation);
  return "";
 }
 public static void info()
 {
  if(total==0)
  {
   System.out.println("Total number of players: 0");
  }
  else
  {
   System.out.println("Total number of players: "+total);
   System.out.print("Player enlisted so far: ");
   for(int i=0;i<11;i++)
   {
    if(allpl[i]!=null)
    {
     if(i==0)
     {
      System.out.print(allpl[i].name);
     }
     else
     {
     System.out.print(", "+allpl[i].name);
     }
    }
    if(i==10)
    {
     System.out.println();
    }
   }
  }
 }
}