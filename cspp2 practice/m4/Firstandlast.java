import java.util.Scanner;
/**
 * @author     SupriyaMadupathi
 */
public final class Firstandlast {
    /**.
     * Constructs the object.
     */
    private Firstandlast() {
    }
     /**
    *@variable TEN variable.
    */
    private static final int SIX = 6;
    /**
    * Main function to print.
    * @param args is the parameter for this function
    */
     public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            /*System.out.println(Arrays.toString(arr));*/
    }
            if (arr[0] == SIX || arr[n - 1] == SIX) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }


