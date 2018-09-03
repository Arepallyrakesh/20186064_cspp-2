import java.util.Scanner;
/**
 * @author : Arepallyrakesh.
 */
class InputValidator {
    /**
     * { var_description }.
     */
    private String na;
    /**
    *@variable SIX variable.
    */
    private static final int SIX = 6;
    /*Write the atrributes and methods for InputValidator*/
    /**
     * Constructs the object.
     *
     * @param      name  The name
     */
    InputValidator(final String name) {
        /**
         * { item_description }.
         */
        this.na = name;
    }
    /**
     * { function_description }.
     *
     * @return     { description_of_the_return_value }
     */
    boolean validateData() {
        if (na.length() >= SIX) {
            return true;
        }
        return false;
    }
}
/**
 * Class for solution.
 */
public final class Solution {
    /**
    * Empty constructor.
    */
    private Solution() {
        //not used
    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData());
    }
}
