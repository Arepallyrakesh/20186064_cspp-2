import java.util.Scanner;
/**
 *do not modify this main function.
 * @author Supriya
 */
public final class Solution {
    /**
    *Private constructor.
    */
    private Solution() {
    //We are not using this constructor.
    }
    /**
    *Do not modify this main function.
    *@param args variable
    */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int base = s.nextInt();
        int exponent = s.nextInt();
        System.out.println((long) power(base, exponent));
    }
    /**
    *Need to write the power function and print the output.
    *@param base variable base
    *@param exponent variable exponent
    *@return double power
    */
    public static double power(final int base, final int exponent) {
        return Math.pow(base, exponent);
    }
}


