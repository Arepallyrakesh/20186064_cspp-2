import java.util.Scanner;
/**
 * @author     Arepallyrakesh
 */
public final class Average {
    /**.
     * Constructs the object.
     */
    private Average() {
    }
    /**
    * Main function to print.
    * @param args is the parameter for this function
    */
     public static void main(final String[] args) {
        int n, sum = 0;
        float avg;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            sum = sum + arr[i];
        }
        avg = (float) sum / n;
        System.out.println("Avarage is :" + avg);
    }
}
