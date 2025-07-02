//task7
public class Cart
{
 public String item[]=new String[3];
 public double price[]=new double[3];
 public int idx,itemcount,cartnum,ctds; 
 public double discount,tp;
 public void create_cart(int num)
 {
  cartnum=num;
 }
 public void addItem(String name,double pc)
 {
   itemcount++;
   if(itemcount>3)
   {
    System.out.println("You already have 3 items in your cart");
   }
   else
   {
    item[idx]=name;
    price[idx]=pc;
    idx++;
    System.out.println(name+" added to cart "+cartnum+".");
    System.out.println("You have "+itemcount+" item(s) in your cart now.");
   }
 }
 public void addItem(double pc,String name)
 {  
   itemcount++;
   if(itemcount>3)
   {
    System.out.println("You have already 3 items in your cart");
   }
   else
   {
    item[idx]=name;
    price[idx]=pc;
    idx++;
    System.out.println(name+" added to cart "+cartnum+".");
    System.out.println("You have "+itemcount+" item(s) in your cart now.");
   }
 }
 public void cartDetails()
 {
  System.out.println("Your cart(c"+cartnum+") :");
  for(int i=0; i<item.length;i++)
  {
   if(ctds==0)
   {
   tp+=price[i];
   }
   if(price[i]!=0)
   {
   System.out.println(item[i]+" - "+price[i]);
   }
  }
   ctds++;
  System.out.println("Discount Applied: "+discount+"%");
  System.out.println("Total price: "+tp);
 }
 public void giveDiscount(int dis)
 { 
  discount=dis;
  tp*=(1-discount/100);
 }
}