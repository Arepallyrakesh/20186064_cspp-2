// Given an String, Write a java method that returns
//the decimal value for the given binary string.
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
     *Do not modify the main function
     * @param args is the parameter for this function
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverse = reverseString(s);
        System.out.println(reverse);
    }
    //Write reverseString function
    /**.
     * { function_description }.
     *
     * @param      s     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public static String reverseString(final String s) {
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        return reverse;
    }
}
