
// Given an String, Write a java method that returns the decimal value for the given binary string.


import java.util.Scanner;
public class Solution
{/*
	Do not modify this main function.
	*/
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	
		/*System.out.println(n);*/
		for(int i = 0; i <= n; i++){
			String s=sc.nextLine();
			/*System.out.println(s);*/
			String res=binaryToDecimal(s);//Write binaryToDecimal function
			System.out.println(res);
		}
	}
	public static String binaryToDecimal(final String s) {
        /*String temp = "";
		temp += Integer.parseInt(s, 2);
		/*System.out.println(temp);*/
		/*return temp;*/
		double j=0;
		
    	for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)== '1') {
         		j = j + Math.pow(2,s.length()-1-i);
         		
     		}
        }
        return Integer.toString((int)j);
	}

}
