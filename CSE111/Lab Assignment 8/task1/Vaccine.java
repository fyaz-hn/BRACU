//task1
public class Vaccine
{
 private String vname,country;
 private int days;
 public Vaccine(String vname,String Country,int days)
 {
  this.vname=vname;
  this.country=country;
  this.days=days;
 }
 public String getvname()
 {
  return vname;
 }
 public String getdays()
 {
  return ""+days;
 }
}