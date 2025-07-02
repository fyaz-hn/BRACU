//task4
public class Nokia extends Mobile
{
 public double bal;
 public String code="";
 public Nokia(String model,boolean sim,String imei,double bal)
 {
  super(model,imei,sim);
  this.bal=bal;
 }
 public String toString()//Nokia n)
 {
  //super.toString();//this has a return statement already so eita work kore na
  return super.toString()+"\nBalance: "+bal+" TK";//"Mobile Phone Detail:\nModel: " + model + "\nIMEICode: " + IMEICode + "\nSIM Card Status: " + simCardStatus+"\nBalance: "+bal+" TK";
 }
 public void rechargeSIMCard(int n)
 {
  bal+=n;
  System.out.println("Recharge successful! Current balance "+bal+" TK");
 }
 public String dialCall(String num)
 {
  if(simCardStatus==true)
  {
   if(bal==0)
   {
    return "Insufficient balance! Please recharge";
   }
   else
   {
    for(int i=0;i<3;i++)
    {
     code+=num.charAt(i);
    }
    if(getCountryName(code)!=null)
    {
    return "Dialing the number "+num+"to "+getCountryName(code)+" region.";
    }
    else
    {
    return "Dialing is not allowed in this region.";
    }
   }
  }
  else
  {
   return "No SIM card available! Please check the SIM card connectivity";
  }
  //return""; concepet no extra return statement? 
 }
}