
//Create a function that takes an integer as input and creates the multiplication table for it.

import java.util.Arrays;

public class MultiplicationTable {

    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(multiplicationTable(5)));
    }

    private static int[][] multiplicationTable(int n){

        int[][] table = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}