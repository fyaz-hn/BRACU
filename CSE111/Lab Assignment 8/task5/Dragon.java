//task5
public class Dragon extends MagicalCreature
{
 public int power;
 public Dragon(String name,int age,int power)
 {
  super(name,age);
  this.power=power;
 }
 public void makeSound()
 {
  System.out.println(name+" roars with a fiery breath!");
 }
 public void performMagic()
 {
  System.out.println(name+" Breathes fire with power level: "+power);
 }
 public void fly ()
 {
  System.out.println(name+" flies through the sky.");
 }
}