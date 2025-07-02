//task10
import java.util.Scanner;
public class TreasureHunt{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [][] arr2D = {{0, 0, 10, 0, -1},
                      {0, -1, 0, 0, -1},
                      {-1, 0, -1, 0, 0},
                      {0, -1, 7, 0, -1},
                      {0, -1, 0, -1, 0}
    };
    System.out.println("Initial Map:");
    printMap(arr2D);
    int row = arr2D.length;
    int col = arr2D[0].length;
    int row_pos = -1, col_pos = -1;
    //To-do: find out the position of the player    
    boolean pos=false;
    for(int i=0; i<row; i++){
      for(int j=0; j<col;j++){
       if (arr2D[i][j]==7){
        pos=true;
        row_pos=i;
        col_pos=j;
      }
     }
    }
    int turns = 5;
    boolean found=false;
    while (turns > 0) {
      int new_row = row_pos, new_col = col_pos;
      System.out.printf("Enter move %d: ",(6-turns));
      String inp = sc.nextLine();
      /*To-do: Based on the input update the player position and check if
       * 1. the player fell out of the grid
       * 2. player stepped on mine
       * 3. player found the treasure
       * otheriwse, update the player position */
      if (new_row+1>=arr2D.length||new_col+1>=arr2D.length||new_col-1<=0||new_row-1<0){
       System.out.println("Player fell outside the playing area.Game over!");          
       break;
      }
      if(inp.equalsIgnoreCase("Left")){
        if(arr2D[new_row][new_col-1]==-1){
         System.out.println("Player stepped on mine.Game over!");
         break;
        }
        else{ 
         if(arr2D[new_row][new_col-1]==10){ 
         found=true;
         System.out.println("Treasure found.You win!");
         }
         arr2D[row_pos][col_pos]=0;
         col_pos--;
         arr2D[new_row][new_col-1]=7;
        } 
      } 
      if(inp.equalsIgnoreCase("Right")){
        if(arr2D[new_row][new_col+1]==-1){
         System.out.println("Player stepped on mine.Game over!");
         break;
        }
        else{
         if(arr2D[new_row][new_col+1]==10){
         found=true;
         System.out.println("Treasure found.You win!");
         }
         arr2D[row_pos][col_pos]=0;
         col_pos++;
         arr2D[new_row][new_col+1]=7;
        }        
      }  
      if(inp.equalsIgnoreCase("Up")){
       if(arr2D[new_row-1][new_col]==-1){
        System.out.println("Player stepped on mine.Game over!");
        break;
       }
       else{
        if(arr2D[new_row-1][new_col]==10){
         found=true;
         System.out.println("Treasure found.You win!");
        }
         arr2D[row_pos][col_pos]=0;
         row_pos--;
         arr2D[new_row-1][new_col]=7;
       }
      }      
      if(inp.equalsIgnoreCase("Down")){
       if(arr2D[new_row+1][new_col]==-1){
        System.out.println("Player stepped on mine.Game over!");
        break;
       }    
       else{
        if(arr2D[new_row+1][new_col]==10){
         found=true;
         System.out.println("Treasure found.You win!");
        }
        arr2D[row_pos][col_pos]=0;
        row_pos++;
        arr2D[new_row+1][new_col]=7;
       }
      }
      if(found==false){
       System.out.println("Current state:");
       printMap(arr2D);
      }
      turns--;
    }
    if (turns == 0 && found==false){
      System.out.println("Failed to find the treasure.");
    }
    else if(found==true){
    System.out.println("Final State:");
    printMap(arr2D);
    }
  }
  public static void printMap(int[][] arr) { 
    // To-do: print the 2D grid
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr[i].length;j++){
       System.out.print(arr[i][j]+"     ");
      }
      System.out.println();
    }
  }
}