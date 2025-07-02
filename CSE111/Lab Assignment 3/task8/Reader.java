//task8
public class Reader
{
 public String str,name="New user";
 public int capacity,bkcount;
 public String books[];
 public String createReader(String name,int num)
 {
  this.name=name;
  capacity=num;
  books=new String[capacity];
  str="A new reader is created!";
 return str;
 }
 public void readerInfo()
 {
  System.out.println("Name:"+ name);
  System.out.println("Capacity: "+capacity);
  System.out.println("Books: ");
  if(bkcount==0)
  {
   System.out.println("No books added yet");
  }
  else
  {
   for(int i=0;i<books.length;i++)
   {
    System.out.println("Book "+(i+1)+": "+books[i]);
   }
  }
 }
 public void addBook(String bk)
 {
  if(bkcount<capacity)
  {
   books[bkcount]=bk;
  }
  else
  {
   System.out.println("No more capacity");
  }
  bkcount++;
 }
}