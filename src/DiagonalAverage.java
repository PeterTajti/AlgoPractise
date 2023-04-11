//Create a function called getADiagonalAvg that takes a multidimensional array (only integers)
//which represents a square matrix and integer value (1 => for diagonal, -1 => for antidiagonal)
// as parameters and returns the average of the numbers in the specified diagonal.
//You cannot nest loops within each other.
//Your solution has to use only one loop which handles both diagonal and antidiagonal case inside.

public class DiagonalAverage {
    public static void main(String[] args) {

        int[][] array = {
                {3, 5, 11, -4},
                {3, 1, 7, 4},
                {5, 0, 2, 9},
                {21, 7, 8, 2}
        };

        System.out.println(getDiagonalAverage(array, 1)); // 2.0
        System.out.println(getDiagonalAverage(array, -1)); // 6.0
    }

    private static double getDiagonalAverage(int[][] array, int whichDiagonal) {

        double avg = 0;
        for (int i = 0; i < array.length; i++) {

            if (whichDiagonal == 1){
                avg += (double) array[i][i] / array.length;
            }
            if (whichDiagonal == -1){
                avg += (double) array[i][array.length - 1 - i] / array.length;
            }
        }
        return avg;
    }
}
