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

