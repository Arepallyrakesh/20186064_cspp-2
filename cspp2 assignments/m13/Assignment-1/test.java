while(i < a.length && j < b.length){
        if(a[i]<b[j])
            ++i;
        else if (a[i] > b[j])
            ++j;
        else{
            if (!result.contains(a[i]))
                result.add(a[i]);
            ++i;
            ++j;
        }   
    }
    return result;
}

public static List<Integer> intersection(List<Integer> a, List<Integer> b){
    Set<Integer> canAdd = new HashSet<Integer>(a);
    List<Integer> result = new ArrayList<Integer>();

    for (int n: b) {
        if(first.contains(n)) {
            result.add(n);
            // we wish to add only one n
            canAdd.remove(n);
        }
    }

    return result;
}

public int[] cartesianProduct(int[] s1, int[] s2) {

    ArrayList<Integer> list = new ArrayList<>();
    for(int i=0;i < s1.length;i++){
    for (int v1: s1) {
        for (int v2: s2) {
            list.add(s1[i], s2[i]);
            }
        }
    }
        int[] result = new int[list.size()];
        int k=0;
        for(int i: list){
            result[k++] = i;
        }   
        return result;
}