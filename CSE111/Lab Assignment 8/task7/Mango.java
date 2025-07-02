//task7
public class Mango extends Fruit
{
 public Mango()
 {
  super(true,"Mango");
 }
 public String toString()
 {
  if(hasFormalin()==true)
  {
   System.out.println(getName()+"s are bad for you");
  }
  else
  {
   System.out.println(getName()+"s are good for you");
  }
  return"";
 }
}