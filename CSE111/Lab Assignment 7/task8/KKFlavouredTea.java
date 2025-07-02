//task8code
public class KKFlavouredTea extends KKTea
{
 public static int kkf;
 public KKFlavouredTea(String name,int price,int bags)
 {
  super(price,bags);
  super.name="KK "+name+" Tea";
 }
 public static void updateSoldStatusFlavoured(KKFlavouredTea t)
 {
  total++;
   kkf++;
  t.status=true;
 }
}