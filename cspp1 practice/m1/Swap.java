/** swap.java.
 * @author Arepallyrakesh.
 */
public final class Swap {
    /**
     *empty constructor.
     */
    private Swap() {

    }
    /**
     * main function to print the hello murthy.
     * @param args is the parameter for this function
     */
    public static void main(final String[] args) {
        int a = 2;
        int b = 3;
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        System.out.println(a + " " + b);
    }
}


