// Given an String, Write a java method that returns the
//decimal value for the given binary string.
import java.util.Scanner;
/**
 * @author     Arepallyrakesh.
 */
public final class Solution {
     /**
     * Constructs the object.
     */
    private Solution() {
    }
    /**.
     * Do not modify this main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            String res = binaryToDecimal(s);
            System.out.println(res);
        }
    }
    /**.
     * { function_description }.
     *
     * @param      s     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public static String binaryToDecimal(final String s) {
        double j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                j = j + Math.pow(2, s.length() - 1 - i);
            }
        }
        return Integer.toString((int) j);
    }
}
