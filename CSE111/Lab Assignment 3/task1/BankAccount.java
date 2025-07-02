//task1
public class BankAccount
{
 public String out;
 public void setInfo(int accno,String type)
 {
  out="Account No: "+accno+"\nType: "+type;
  System.out.println("Account information updated!");
 }
 public String  printDetails()
 {
  if(out==null)
  {
   out="Account No: 0\nType: Not Set";
  }
  return out;
 }
}