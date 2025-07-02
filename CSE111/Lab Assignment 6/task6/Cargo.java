//task6
public class Cargo
{
 public String cont;
 public int id;
 public double load;
 public boolean loaded=false;
 public static double cap=10;
 public static int cnum;
 public Cargo()
 {}
 public Cargo(String cont,double load)
 {
  this.cont=cont;
  this.load=load;
  cnum++;
  id=cnum;
 }
 public static double capacity()
 {
 return cap;
 }
 public void details()
 {
 System.out.println("Cargo ID: "+id+", Contents: "+cont+", Weight: "+load+", Loaded: "+loaded); 
 }
 public void load()
 {
  if(cap-load>0)
  {
   loaded=true;
   cap-=load;
   System.out.println("Cargo "+id+" loaded for transport.");
  }
  else
  {
  System.out.println("Cannot load cargo, exceeds weight capacity.");
  }
 }
 public void unload()
 {
  loaded=false;
  System.out.println("Cargo "+id+" unloaded");
  cap+=load;
 }
}