import java.util.*;

public class GameOfLife {

  public static void main (String[] args) {
    String[][] game = new String[10][15];
    for (int i = 0; i < game.length; i++){
      for (int j = 0; j < game[0].length; j++){
        if(Math.random() < 0.5)
          game[i][j] = "O";
        else
          game[i][j] = " ";
      }
    }

    for (String[] i : game){
      for (String j : i){
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

}
