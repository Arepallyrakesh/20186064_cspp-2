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
class FrequencyDict {
	HashMap<String, Integer> hm;
	FrequencyDict() {
		hm = new HashMap<String, Integer>();
	}
	HashMap<String, Integer> makeDict(String[] d) {
		HashSet<String> set = new HashSet<>(Arrays.asList(d));
		int cnt = 0;
		for (String l : set) {
			cnt = 0;
			for (String k : d) {
				if (l.equals(k)) {
					cnt++;
				}
			}
			hm.put(l, cnt);
		}
		return hm;
	}
}
class Plagarism {
	Plagarism() {

	}
	int Dotproduct(HashMap<String, Integer> freqd1, HashMap<String, Integer> freqd2) {
		int dp = 0;
		HashSet<String> newSet = new HashSet<String>(freqd1.keySet());
		newSet.addAll(freqd2.keySet());
		for (String k : newSet) {
			if (freqd1.get(k) == null) {
				freqd1.put(k, 0);
			}
			if (freqd2.get(k) == null) {
				freqd2.put(k, 0);
			}
			dp += freqd1.get(k) * freqd2.get(k);
		}
		return dp;
	}
	double EuclideanNorm(Collection<Integer> a, Collection<Integer> b) {
		int s1 = 0;
		int s2 = 0;
		for (int element : a) {
			s1 += Math.pow(element, 2);
		}
		for (int element1 : b) {
			s2 += Math.pow(element1, 2);
		}
		return Math.sqrt(s1) * Math.sqrt(s2);
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
		Scanner s = new Scanner(new File("File5.txt"));
		String c = "";
		while(s.hasNext()) {
			String d = s.nextLine();
			c = c + d;
	
		}
		FrequencyDict k1 = new FrequencyDict();
		FrequencyDict k2 = new FrequencyDict();
		Plagarism pl = new Plagarism();
		
		


		HashMap<String, Integer> freqd1 = k1.makeDict(cleanstring(b.toLowerCase()).split(" "));
		HashMap<String, Integer> freqd2 = k2.makeDict(cleanstring(c.toLowerCase()).split(" "));
		int dp = pl.Dotproduct(freqd1, freqd2);
		double en = pl.EuclideanNorm(freqd1.values(), freqd2.values());
		System.out.println("percent of matching= " + (dp / en) * 100 + "%");

	}

	
	public static String cleanstring(String d1) {
		Pattern p = Pattern.compile("[^a-z 0-9 _]");
		Matcher m = p.matcher(d1);
		String number = m.replaceAll("");
		return number;
	}
		
				
			}
			
		
