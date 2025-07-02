//task1
public class Product
{
  private String name="Unknown";
  private double price;
  private int qt;  
  public Product()
  {}
  public Product(String name,double price)
  {
   this.name=name;
   this.price=price;
  }
  public void displayInfo()
  {
  System.out.println("Product Name: "+name);
  System.out.println("Price $"+price); 
  }
  public void  displayInfo(boolean f)
  {
   if(f==true)
   {
   System.out.println("Product Name: "+name);
   System.out.println("Price $"+price);
   System.out.println("Quantity: "+qt);
   }
   else
   {  
     System.out.println("Product Name: "+name);
     System.out.println("Price $"+price); 
   }
  }
  public void setQuantity(int qt)
  {
  this.qt=qt;
  }
  public double getPrice()
  {
  return price;
  }
  public int getQuantity()
  {
  return qt; 
  }
}