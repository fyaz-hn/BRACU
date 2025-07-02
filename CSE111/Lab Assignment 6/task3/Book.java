//task3
public class Book
{
 public String name;
 public double price=150,dis;
 public static int total_books_sold;
 public static double total_revenue;
 public Book()
 {}
 public Book(String name, int dis)
 {
  total_books_sold++;
  this.name=name;
  this.dis=dis;
  discalc();
 }
 public void discalc()
 {  
  price*=1-dis/100;
  total_revenue+=price;
 }
 public void bookDetails()
 {
  System.out.println("Title: "+name);
  System.out.println("Price after Discount: "+price+" TK");
 }
}








