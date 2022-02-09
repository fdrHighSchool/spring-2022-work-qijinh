public class ArrayResizer {

  public static void main (String[] args){

    int[][] arr = {{2, 1, 0},
                   {1, 3, 2},
                   {0, 0, 0},
                   {4, 5, 6}};

    int[][] smaller = ArrayResizer.resize(arr);

    System.out.println("Is row [2] non zero row? " + isNonZeroRow(arr, 1));

    for (int[] row : smaller){
      for (int col : row){
        System.out.print(col + " ");
      }
      System.out.println();
    }

  }

  public static boolean isNonZeroRow (int[][] array2D, int r){

    for (int i = 0; i < array2D[0].length; i++){

      if(array2D[r][i] == 0)
        return false;
      }

        return true;

  }

  public static int numNonZeroRow(int[][] array2D){

    int k = 0;

    for (int i = 0; i < array2D.length; i++){

      if (isNonZeroRow(array2D, i))
        k++;

    }

    return k;

  }

  public static int[][] resize (int[][] array2D){

    int k = 0;
    int[][] resize =  new int[numNonZeroRow(array2D)][array2D[0].length];

    for (int j = 0; j < array2D.length; j++) {

      if (isNonZeroRow(array2D, j)){
        int i = 0;
        for (int col : array2D[j]){
            resize[k][i] = col;
            i++;
        }
        k++;
      }
    }

    return resize;

  }

}
