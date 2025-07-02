//task7
public class Jackfruit extends Fruit
{
 public Jackfruit()
 {
  super(false,"Jackfruit");
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