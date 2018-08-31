import java.util.Scanner;
/**
 * @author     Arepallyrakesh
 */
public final class Concatinate {
    /**.
     * Constructs the object.
     */
    private Concatinate() {
    }
    /**.
    * Main function to print.
    * @param args is the parameter for this function
    */
    public  static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String s1 = "Hello ";
        String s2 = "!";
        String s3 = s1.concat(str);
        String s4 = s3.concat(s2);
        System.out.println(s4);
    }
}
