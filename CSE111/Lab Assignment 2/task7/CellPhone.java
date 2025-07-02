//task7
public class CellPhone
{
 public String model="unknown";
 public int count;
 public String store; 
 public void storeContact(String str)
 {
  count++;
  if (count>3)
  {
   System.out.println("Memory full. New contact can't be stored.");
   count--;
  }
  else 
  {
   if (count==1) 
   {
    store=str;
   }
   else
   {
    store+="\n"+str;
   }
  System.out.println("Contact Stored");
  }
 }
 public void printDetails()
 {
  System.out.println("Phone Model "+model);
  System.out.println("Contacts Stored "+count);
  if (count>0)
  {
   System.out.println("Stored Contacts :");
   System.out.println(store);
  }
 }
}