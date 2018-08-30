import java.util.Scanner;
/**
 *@author Arepallyrakesh
 */
public final class Solution {
    /*
    Do not modify this main function.
    */
    /**
     * Empty Constructor.
     */
    private Solution() {
        //Iam not using this constructor
    }
    /**
     * Main function to print.
     * @param args is the parameter for this function
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
            int maximum = a[0];
            for (int i = 1; i < a.length; i++) {
                if (a[i] > maximum) {
                    maximum = a[i];
           }
        }
        System.out.println(maximum);
    }
}
