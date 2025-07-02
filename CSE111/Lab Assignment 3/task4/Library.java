//task4
public class Library
{
 public int bookcap;
 public int totalbooks;
 public String books;
 public void setBookCapacity(int cap)
 {
  bookcap=cap;
 }
 public void addBook(String name)
 {
  totalbooks++;
  if(totalbooks>bookcap)
  {
   totalbooks--;
   System.out.println("Maximum capacity exceeds. You can't add more than "+bookcap+" books");
  }  
  else
  {  
   if(books==null)
   {
    books=name;
   }
   else
   {
    books+="\n"+name;  
   }
   System.out.println("Book '"+name+"' added to the library");
  }
 }
 public void printDetail()
 {
  System.out.println("Maximum Capacity: "+bookcap+"\nTotal Books: "+totalbooks+"\nBooks List:\n"+books);
 }
}