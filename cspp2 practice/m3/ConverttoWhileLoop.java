import java.util.Scanner;
/**
 *@author repallyrakesh
 */
public final class ConverttoWhileLoop {
    /*
    Do not modify this main function.
    */
    /**
     * Empty Constructor.
     */
    private ConverttoWhileLoop() {
        //Iam not using this constructor
    }
    /**
     * Main function to print.
     * @param args is the parameter for this function
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int i = 2;
        while (i <= 10) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("GoodBye!");
    }
}
