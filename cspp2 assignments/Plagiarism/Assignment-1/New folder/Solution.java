import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.IOException;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Collection;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Equal {
	
	Equal(String[] n, String[] m) {
		int a = 0 ;
		int k = 0;
		int count = 0;
		String s = "";
		for (int i = 0; i < n.length; i++) {
			for (int j = k; j < m.length ;j++ ) {
				if (n[i].equals(m[j])) {
					if (i > 0 && j > 0) {
						if(n[i - 1].equals(m[j - 1])) {
							s += n;
						}
					}
					if (n[i].length() > a) {
						a = n[i].length();
					}
					count += 1;
					k = j+ 1;
					break; 
				}
				
			}
			System.out.println(i);
		}
		System.out.println(a);

	}

}
public class Solution {
	public static void main(String[] args) throws IOException {
		/*try {*/
		Scanner sc = new Scanner(new File("File2.txt"));
		String b = "";
		while(sc.hasNext()) {
			String a = sc.nextLine();
			b = b + a;
	
		}
		String[] file1 = cleanstring(b.toLowerCase()).split(" ");
		
		Scanner s = new Scanner(new File("File5.txt"));
		String c = "";
		while(s.hasNext()) {
			String d = s.nextLine();
			c = c + d;
	
		}
		String[] file2 = cleanstring(b.toLowerCase()).split(" ");
		//System.out.println(Arrays.toString(cleanstring(c.toLowerCase()).split(" ")));
		Equal ss = new  Equal(file1, file2);
		/*FrequencyDict k1 = new FrequencyDict();
		FrequencyDict k2 = new FrequencyDict();
		Palgarism pl = new Palgarism();*/
		
		


		/*HashMap<String, Integer> freqd1 = k1.makeDict(cleanstring(b.toLowerCase()).split(" "));
		HashMap<String, Integer> freqd2 = k2.makeDict(cleanstring(c.toLowerCase()).split(" "));
		int dp = pl.Dotproduct(freqd1, freqd2);*/
		/*double en = pl.EuclideanNorm(freqd1.values(), freqd2.values());
		System.out.println("percent of matching= " + (dp / en) * 100 + "%");*/

	}

	
	public static String cleanstring(String d1) {
		Pattern p = Pattern.compile("[^a-z 0-9 _]");
		Matcher m = p.matcher(d1);
		String number = m.replaceAll("");
		return number;
	}
		
				
			}
			
		
