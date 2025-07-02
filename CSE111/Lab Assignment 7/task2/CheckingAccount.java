//task2code
public class CheckingAccount extends Account
{
 public static int count;
 public CheckingAccount()
 { 
  super(0);
  count++;
 }
 public CheckingAccount(double bl)
 {
  super(bl);
  count++;
 }
}