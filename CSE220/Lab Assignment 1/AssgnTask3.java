//Assignment Task 03: Matrix Compression
class AssgnTask3{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static Integer[][] compressMatrix( Integer[][] matrix ){

        //For this task you'll need to create new 2D array
        
        //TO DO
        // for(int i=0,j=0;i<2;i++)
        // {
        //  for(int k=0;k<matrix.length/2;k++)
        //  {
        //   for(int l=0;l<matrix[0].length/2;l++)
        //   {
        //   newarr[i][j]+=matrix[k][l];  
        //   }
        //  }
        // }
        Integer[][] newarr = new Integer[2][2];
        newarr[0][0] = 0;
        newarr[0][1] = 0;
        newarr[1][0] = 0;
        newarr[1][1] = 0;
        for(int i=0;i<matrix.length/2;i++)
        {
         for(int j=0;j<matrix.length/2;j++)
         {
          newarr[0][0]+=matrix[i][j];
         }
        }
        for (int i=0;i<matrix.length/2; i++) 
        {
         for (int j=matrix.length/2;j< matrix.length;j++) 
         {
          newarr[0][1] += matrix[i][j];
         }
        }
        for (int i = matrix.length/2; i < matrix.length; i++) {
            for (int j = 0;j< matrix.length/2; j++) {
                newarr[1][0] += matrix[i][j];
            }
        }
        for (int i = matrix.length/2; i < matrix.length; i++) {
            for (int j = matrix.length/2; j < matrix.length; j++) {
                newarr[1][1] += matrix[i][j];
            }
        }
        //remove the line below and return the newly created Compressed 2D matrix
        return newarr;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            { 1 , 2 , 3 , 4 },
            { 5 , 6 , 7 , 8 },
            { 1 , 3 , 5 , 2 },
            {-2 , 0 , 6 ,-3 }
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        
        System.out.println("\nExpected Output:");
        System.out.print("| 14 | 22 |\n| 2  | 10 |\n");
        
        System.out.print("\nYour Output:\n");
        Integer[][] returnedArray = compressMatrix( matrix );
        Arr.print2D( returnedArray );
    }
}