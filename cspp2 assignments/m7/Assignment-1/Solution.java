import java.util.Scanner;
/**
 * @author : Arepallyrakesh.
 */
class InputValidator {
	/**
	 * { var_description }.
	 */
	private String name;
	/*Write the atrributes and methods for InputValidator*/
	InputValidator(final String name) {
		/**
		 * { item_description }.
		 */
		this.name = name;
    }
   	/**
   	 * { function_description }.
   	 *
   	 * @return     { description_of_the_return_value }
   	 */
   	boolean validateData() {
    	if (name.length() >= 6) {
    		return true;
    	} else {
    		return false;
    	}
    }
}
/**
 * Class for solution.
 */
class Solution {
	/**
	 * { function_description }
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