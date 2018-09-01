import java.util.Scanner;
/**.
 * Write a java program to find the odd composite numbers.
 * between 2 and n where n is given as an input.
 *
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
     * Prints the odd composite numbers between 2 and n.
     *
     * @param      n     n value
     */
    static void oddComposites(final int n) {
	// write your code here
        int check = 0;
        for (int i = 3; i < n; i++) {
            if (i % 2 != 0) {
                check = getcomposite(i);
                if (check > 1) {
                    System.out.println(i);
            }
            }
        }
    }
    /**
     * { function_description }
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

