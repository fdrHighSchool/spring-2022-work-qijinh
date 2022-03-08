import java.util.*;

public class GameOfLife {

  public static void main (String[] args) {
    String[][] game = SetUp();
    Display(game);
    System.out.println();
    game = NextGen(game);
    Display(game);


  }


  public static String[][] SetUp() {
    String[][] game = new String[8][15];
    for (int i = 0; i < game.length; i++){
      for (int j = 0; j < game[0].length; j++){
        if(Math.random() < 0.5)
          game[i][j] = "O";
        else
          game[i][j] = " ";
      }
    }
    return game;
  }


  public static void Display(String[][] game) {
    for (String[] i : game){
      for (String j : i){
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }


  public static String[][] NextGen(String[][] game) {
    String[][] nextGen = new String[game.length][game[0].length];
    for (int row = 0; row < game.length; row++) {
      for (int col = 0; col < game[0].length; col++) {
        nextGen[row][col] = " ";
      }
    }

    //row 2 - 7, col 2 - 14
    int i = 0;
    for (int row = 1; row < game.length - 1; row++) {
      for (int col = 1; col < game[0].length - 1; col++) {
        i = 0;
        if (game[row][col] == "O")
          i--;

        for (int r = -1; r <= 1; r++) {
          for (int c = -1;c <= 1; c++) {
            if (game[row + r][col + c] == "O"){
              i++;
            }
          }
        }
        if (i >= 2 && i < 4)
          nextGen[row][col] = "O";
      }
    }

    //row 2 - 7, col 1
    for (int row = 1; row < game.length - 1; row++) {
        i = 0;
        if (game[row][0] == "O")
          i--;

        for (int r = -1; r <= 1; r++) {
          for (int c = 0;c <= 1; c++) {
            if (game[row + r][0 + c] == "O"){
              i++;
            }
          }
        }
        if (i >= 2 && i < 4)
          nextGen[row][0] = "O";
    }

    //row 2 - 7, col 15
    for (int row = 1; row < game.length - 1; row++) {
        i = 0;
        if (game[row][14] == "O")
          i--;

        for (int r = -1; r <= 1; r++) {
          for (int c = -1;c <= 0; c++) {
            if (game[row + r][14 + c] == "O"){
              i++;
            }
          }
        }
        if (i >= 2 && i < 4)
          nextGen[row][14] = "O";
    }

    //row 1, col 2 - 14
    for (int col = 1; col < game.length - 1; col++) {
        i = 0;
        if (game[0][col] == "O")
          i--;

        for (int r = 0; r <= 1; r++) {
          for (int c = -1;c <= 1; c++) {
            if (game[0 + r][col + c] == "O"){
              i++;
            }
          }
        }
        if (i >= 2 && i < 4)
          nextGen[0][col] = "O";
    }

    //row 8, col 2 - 14
    for (int col = 1; col < game.length - 1; col++) {
        i = 0;
        if (game[7][col] == "O")
          i--;

        for (int r = -1; r <= 0; r++) {
          for (int c = -1;c <= 1; c++) {
            if (game[7 + r][col + c] == "O"){
              i++;
            }
          }
        }
        if (i >= 2 && i < 4)
          nextGen[7][col] = "O";
    }

    //left top corner
      i = 0;
      if (game[0][0] == "O")
        i--;

      for (int r = 0; r <= 1; r++) {
        for (int c = 0;c <= 1; c++) {
          if (game[0 + r][0 + c] == "O"){
            i++;
          }
        }
      }
      if (i >= 2 && i < 4)
        nextGen[0][0] = "O";

    //left down corner
    i = 0;
    if (game[7][0] == "O")
      i--;

    for (int r = -1; r <= 0; r++) {
      for (int c = 0;c <= 1; c++) {
        if (game[7 + r][0 + c] == "O"){
          i++;
        }
      }
    }
    if (i >= 2 && i < 4)
      nextGen[7][0] = "O";

    //right top corner
    i = 0;
    if (game[0][14] == "O")
      i--;

    for (int r = 0; r <= 1; r++) {
      for (int c = -1;c <= 0; c++) {
        if (game[0 + r][14 + c] == "O"){
          i++;
        }
      }
    }
    if (i >= 2 && i < 4)
      nextGen[0][14] = "O";

    //right down corner
    i = 0;
    if (game[7][14] == "O")
      i--;

    for (int r = -1; r <= 0; r++) {
      for (int c = -1;c <= 0; c++) {
        if (game[7 + r][14 + c] == "O"){
          i++;
        }
      }
    }
    if (i >= 2 && i < 4)
      nextGen[7][14] = "O";

    return nextGen;
  }


}
