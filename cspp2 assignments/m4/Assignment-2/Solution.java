import java.util.*;
import java.util.Scanner;
public class Solution {
	/* Fill the main function to print resultant of addition of matrices*/
	public static void main(String[] args) {
		int p, q, m, n;
		Scanner s = new Scanner(System.in);
		p = s.nextInt();
		q = s.nextInt();
		int a[][] = new int[p][q];
		for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < q; j++) 
                {
                    a[i][j] = s.nextInt();
                }
        System.out.println(Arrays.toString(a));
		m = s.nextInt();
		n = s.nextInt();
        int b[][] = new int[m][n];
        for (int c = 0; c < m; c++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    b[c][j] = s.nextInt();
                }
            }
        System.out.println(Arrays.toString(a));

	}
}
}