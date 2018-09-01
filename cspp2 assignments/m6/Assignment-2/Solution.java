import java.util.Scanner;
/**
 * Write a java program to round the
 * elements of a matrix to the nearest 100.
 *
 * @author :Arepallyrakesh
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //not used
    }
    /**
    *@variable HUNDERED variable.
    */
    private static final int HUNDERED = 100;
    /**
    *@variable FOUR variable.
    */
    private static final int FOUR = 49;
    /**
     * Function to round the
     * elements of a matrix to the nearest 100.
     *
     * @param      a     Matrix of which the elements to be rounded
     * @param      rows     Number of rows
     * @param      columns     Number of columns
     *
     * @return     Matrix of the rounded elements
     */
    static int[][] roundHundred(final int[][] a,
                                final int rows,
                                final int columns) {

	// write ypur code here
	   int[][] s = new int[rows][columns];
       for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            int b =  a[i][j] / HUNDERED;
            if (a[i][j] > (b * HUNDERED) + FOUR) {
                s[i][j] = (b + 1) * HUNDERED;

            } else {
                s[i][j] = b * HUNDERED;
            }   
            }
       }
       return s;
    }
    /**
     * Main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scan.nextInt();
                /*System.out.println(a);*/
            }
        }
        int[][] b = roundHundred(a, m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println(b[i][n - 1]);
        }
    }
}
