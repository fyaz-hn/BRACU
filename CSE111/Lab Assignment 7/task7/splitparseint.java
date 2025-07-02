public class splitparseint
{
  public static void main(String[]args)
  {
    String time="18:30";
    String parts[]=time.split(":");
    //int t=Integer.parseInt(time);
  
    System.out.println(parts[0]+2);
    System.out.println(Integer.parseInt(parts[0])+2);
  
  }
  

}