//task8code
public class KKTea extends Tea
{
 public String name="KK Regular Tea";
 public static int total,kkr;
 public int weight,bags;
 public KKTea(int price,int bags)
 {
  super("KK Regular Tea",price);
  this.bags=bags;
 }
 public static void totalSales()
 {
  System.out.println("Total Sales: "+total);
  System.out.println("KK Regular Tea: "+kkr);
  if(total!=kkr)
  {
  System.out.println("KK Flavoured Tea: "+(total-kkr));
  }
 }
 public static void updateSoldStatusRegular(KKTea t)
 {
  total++;
  kkr++;
  t.status=true;
 }
 public void productDetail()
 {
  super.name=name;
  super.productDetail();
  System.out.println("Weight: "+bags*2+", Tea Bags:"+bags);;
 }
}