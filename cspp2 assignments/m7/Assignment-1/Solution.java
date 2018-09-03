import java.util.Scanner;
/**
 * @author : Arepallyrakesh.
 */
class InputValidator {
	/**
	 * { var_description }
	 */
	private String name;
	
	/*Write the atrributes and methods for InputValidator*/
	InputValidator(String name) {
		/**
		 * { item_description }
		 */
		this.name = name;
    }
   	boolean validateData(){
   		/**
   		 * { item_description }
   		 */
    	if (name.length() >= 6) {
    		return true;
    	} else {
    		return false;
    	}
    }
}
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