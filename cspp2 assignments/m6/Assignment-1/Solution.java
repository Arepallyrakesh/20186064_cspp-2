import java.util.Scanner;
/**
 * @author : Arepallyrakesh
 */
public final class Solution {
    /**
    * Empty constructor.
    */
    private Solution() {
        //not used
    }
    /**
    *@variable FOUR variable.
    */
    private static final int THREE = 3;
    /**
     * Prints the odd composite numbers between 2 and n.
     *
     * @param      n     n value
     */
    static void oddComposites(final int n) {
    // write your code here
        int check = 0;
        for (int i = THREE; i < n; i++) {
            if (i % 2 != 0) {
                check = getcomposite(i);
                if (check > 1) {
                    System.out.println(i);
            }
            }
        }
    }
    /**.
     * { function_description }.
     *
     * @param      n     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public static int getcomposite(final int n) {
        int i = 2;
        int count = 0;
        while (i <= n) {
            if (n % i == 0) {
                count = count + 1;
            }
            i = i + 1;
        }
        return count;
    }
    /**
    * main method as driver program.
    * @param args is the parameter for this method
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        oddComposites(n);
    }
}

