//task5
public class Borrower
{
  public String brbooks[]=new String[3],brname;
  public int idx;
  public static int book_count[] = {3, 3, 3},rembooks;
  public static String book_name[] = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};
 
  // Your Code here
  public Borrower()
  {}
  public Borrower(String brname)
  {
   this.brname=brname;
  }
  public static void bookStatus()
  {
   System.out.println("Available Books:");
   for(int i=0;i<book_count.length;i++)
   {
    System.out.println(book_name[i]+": "+book_count[i]);
   }
  }
  public void borrowBook(String bk)
  {
   for(int i=0;i<book_count.length;i++)
   {
    if(bk.equals(book_name[i]))
    {
     if(book_count[i]!=0)
     {
      brbooks[idx]=bk;
      book_count[i]--;
      idx++;
     }
     else
     {
      System.out.println("This book is not available.");
     }
    }
   }
  }
  public void borrowerDetails()
  {
   System.out.println("Name: "+brname);
   System.out.println("Books Borrowed: ");
   for(int i=0;i<brbooks.length;i++)
   {
    if(brbooks[i]!=null)
    {
     System.out.println(brbooks[i]);
    }
   }
  }
  public static int remainingBooks(String bk)
  {
   for(int i=0;i<book_count.length;i++)
   {
    if(bk.equals(book_name[i]))
    {
     rembooks=book_count[i];
    }
   }
  return rembooks;  
  }
}
