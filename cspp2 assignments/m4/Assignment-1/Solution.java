
import java.util.*;

public class Solution
{/*
	Fill this main function to print maximum of given array
	*/
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
            int maximum = a[0];
            for (int i = 1; i< a.length; i++){
                if (a[i] > maximum){
                    maximum = a[i];
                }
        } 
        System.out.println(maximum);
    }
}
      
