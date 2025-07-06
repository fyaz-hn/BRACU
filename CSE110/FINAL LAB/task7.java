public class task7
{
  public static void main(String[]args)
  {
    int arr[]={6,13,28,17,3,9,11,23,10,29,12,7};
    int num=0;
    System.out.println("Prime Numbers:");
    for(int i=0; i<=arr.length-1; i++)
    {
      num=arr[i];
      int count=0;
      int sum=0;
      for(int j=1; j<num;j++)
      {
       if(num%j==0)
       {
       count++;
       sum+=j;
       }
      }
      if(count==1)
      {
      System.out.println(i+": "+num);
      }
      /*else if(sum==num)
      {
       System.out.println(i+": "+num);         //Same loop e ki kora jaito?
      }*/
    }
    System.out.println();
    System.out.println();
    System.out.println("Perfect Numbers:");;
    for(int i=0; i<=arr.length-1; i++)
    {
      num=arr[i];
      int sum=0;
      for(int j=1; j<num;j++)
      {
       if(num%j==0)
       {
       sum+=j;
       }
      }
      if(sum==num)
      {
       System.out.println(i+": "+num);
      }
    }
  }
}