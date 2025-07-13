//Assignment Task 01: Container with Most Water
class AssgnTask1{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static void mostWater( Integer[] height ){

        //TO DO

        Integer [][] xy=new Integer[9][2];
        int area;
        int max1=0;//had to initialize
        int x=1;
        for(int i=0;i<xy.length;i++)
        {
         xy[i][0]=x;
         xy[i][1]=height[i];
         x++;
        }
        //Arr.print2D(xy);
        for(int i=0;i<xy.length;i++)
        {
          for(int j=0;j<xy.length-1;j++)
          {
            int length=xy[i][0]-xy[j][0];
            length=Math.abs(length);
            int height2=Math.min(xy[i][1],xy[j][1]);
            area=length*height2;
            max1=Math.max(area,max1);
          }  
        }
        System.out.println(max1);
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[] array = {1,8,6,2,5,4,8,3,7};
        System.out.println("Given Array: ");
        Arr.print(array);
        System.out.println("\nExpected Output:");
        System.out.print("49");
	System.out.print("\nYour Output:\n");
        mostWater( array );

    }
}
