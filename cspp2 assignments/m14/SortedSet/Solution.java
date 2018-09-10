import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;
public class Solution{
	private int[] set;
	private int size;

	public Solution() {
		set = new int[10];
		size = 0;
	}
	public void add(int item){
		if(size == set.length) {
			resize();
		} else {
			for (int i = 0 ; i < size() ;i++ ) {
				int c = 0;
				for (int j = 0;j<size() ;j++ ) {
					if (item == set[j]) {
						c+=1;
					}	
						if(c==0){
							if(!(item>set[i])){
								
							}else{
								for (int p =i;p<size();p++){
									set[p+1] = set[p];
				}
			}

					}
				}
			}
		}

	}
	public int size() {
		return size;
	}
	public void resize() {
		set = java.util.Arrays.copyOf(set, size * 2);
	}

	public void addAll(int[] item) {
		for(int i = 0; i< item.length; i++) {
			add(item[i]);
		}
	}
	public int last() {
		if (size() == 0){
			System.out.println("Set​ Empty​ Exception");
		}
		return set[size - 1];
		
	}
	public String toString() {


        if (size == 0) {
            return "{}";
        }
        String s = "{";
        int i;
        for (i = 0; i < size - 1; i++) {
            s = s + set[i] + ", ";
        }
        s = s + set[i] + "}";
        /*if (list[0] == 0) {
                s += "\nInvalid Position Exception";
            }*/
        return s;
    }
	/*public Set subSet(int fromElement,int toElement)​{

	}
	public  headSet(int toElement)​ {

	}*/
    public int indexOf(final int item) {

        for (int i = 0; i < size; i++) {
            if (item == set[i]) {
                return i;
            }
        }
        return -1;
    }
	/*public static int[] intArray(final String s) {
        String input = s;
        if (input.equals("[]")) {
            return new int[0];
        }
        if (s.contains("[")) {
            input = s.substring(1, s.length() - 1);
        }
        return Arrays.stream(input.split(","))
                            .mapToInt(Integer::parseInt);

    }*/
    public boolean contains(final int item) {

        if (indexOf(item) >= 0) {
            return true;
        }
        return false;
    }
          

public static void main(String[] args) {
        // instantiate this set
        Solution s = new Solution();
        // code to read the test cases input file
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        // check if there is one more line to process
        while (stdin.hasNext()) {
            // read the line
            String line = stdin.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
            case "size":
                System.out.println(s.size());
                break;
            case "contains":
                System.out.println(s.contains(Integer.parseInt(tokens[1])));
                break;
            case "print":
                System.out.println(s);
                break;
            case "addAll":
                if (tokens.length == 2) {
                    String[] t1 = tokens[1].split(",");
                    int[] temp = new int[t1.length];
                    for (int i = 0; i < temp.length; i++) {
                        temp[i] = Integer.parseInt(t1[i]);
                    }
                    s.addAll(temp);
                }
            /*    break;
            case "subSet" :
            	System.out.println(s.subSet(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1])));
            	break;
            case "headSet":
            	System.out.println(s.subSet(Integer.parseInt(tokens[1])));

            	break;*/
            case "last" :
            	System.out.println(s.last());
            	break;
            default :
            	break;
            }
        }
    }
}
