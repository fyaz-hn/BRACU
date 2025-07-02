//task6
public class Bondhus extends SocialMedia
{
 public String inbox[]=new String[5];
 public int msgcount=0;
 public Bondhus(String name,String mail)
 {
  super(name,mail);
 }
 public void showSentbox()
 {
  System.out.println(userName+"'s Sentbox:");
  if(msgcount==0)
  {
   System.out.println("No sent messages.");
  }
  else
  {
   for (int i=0;i<inbox.length;i++)
   {
    if(inbox[i]!=null)
    {
    System.out.println(inbox[i]);
    }
   }
  }
 }
 public void sendMessage(String msg)
 {
  if(msgcount<inbox.length)
  {
   inbox[msgcount]=msg;
   msgcount++;
  }
  else if(msgcount==5)
  {
   System.out.println("Sentbox is full.");
  }
 }
 public String toString()
 {
  return userName + "'s profile:"+ "\nUser Name: " + userName + "\nEmail:" + email+"\nMessages Sent: "+msgcount;
 }
}