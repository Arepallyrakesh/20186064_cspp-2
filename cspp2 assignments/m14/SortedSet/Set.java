import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for set.
 * @author     : Arepallyrakesh
 */
class Set {
    //your code goes here...
    //Good luck :-)
    //
    /**
     * Set Integer Array.
     */
    private int[] set;
    /**
     * { Size Variable }.
     */
    private int size;
    /**
     * TEN Integer Variable.
     */
    private static final int TEN = 10;
    /**
     * Constructs the object.
     */
    Set() {
        set = new int[TEN];
        size = 0;
    }
    /**
     * { Contains Method }.
     *
     * @param      item  The item
     *
     * @return     { Returns Boolean }
     */
    public boolean contains(final int item) {
        for (int i = 0; i < size; i++) {
            if (set[i] == item) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        String str = "{";
        if (size > 0) {
            for (int i = 0; i < size - 1; i++) {
                str += set[i] + ", ";
            }
            str += set[size - 1];
        }
        str += "}";
        return str;
    }
    /**
     * { Maximum Method }.
     *
     * @return     { Returns Integer Value }
     */
    public int max() {
        int max = set[0];
        for (int i = 0; i < size; i++) {
            if(max < set[i]) {
                max = set[i];
            }
        }
        return max;
    }
    /**
     * { Min Method }.
     *
     * @return     { Returns Integer Value }
     */
    public int min() {
        int max =set[0];
        for (int i = 0; i < size; i++) {
            if(max > set[i]) {
                max = set[i];
            }
        }
        return max;
    }
    /**
     * { Add Method }.
     *
     * @param      item  The item
     */
    public void add(final int item) {
        if (!(contains(item))) {
            if (size >= set.length) {
                resize();
            }
            if (size > 0) {
                for (int i = 0; i < size; i++) {
                    if (set[i] < item && set[i+1] > item) {
                        add(i+1, item);
                        break;
                    } else if (item > max()) {
                        add(size, item);
                        break;
                    } else if(item < min()){
                        add(0, item);
                        break;
                    }
                }
            } else {
                set[size] = item;
                size += 1;
            }
        }
    }
    /**
     * { SubSet Method }.
     *
     * @param      sele  The sele
     * @param      eele  The eele
     *
     * @return     { Returns Set }
     */
    public Set subSet(int sele, int eele) {
        Set subset = new Set();
        if (sele <= eele) {
            Set trail = new Set();
            trail = headSet(eele);
            for (int i = 0; i < trail.size(); i++) {
                if(set[i] >= sele) {
                    subset.add(set[i]);
                }
            }
            return subset;
        }
        System.out.println("Invalid Arguments to Subset Exception");
        return null;
    }
    /**
     * { Head Set of Set }.
     *
     * @param      element  The element
     *
     * @return     { Returns Set }
     */
    public Set headSet(int element) {
        Set headset = new Set();
        for (int i = 0; i < this.size(); i++) {
            if(set[i] < element) {
                headset.add(set[i]);
            }
        }
        return headset;
    }
    /**
     * { Last Element in Set }.
     *
     * @return     { Returns Integer }
     */
    public int last() {
        if (size > 0) {
            return max();
        }
        System.out.println("Set Empty Exception");
        return -1;
    }
    /**
     * { Add at Index Method }.
     *
     * @param      index  The index
     * @param      item   The item
     */
    public void add(final int index, final int item) {
        for (int i = size - 1; i >= index; i--) {
            set[i + 1] = set[i];
        }
        set[index] = item;
        size += 1;
    }
    /**
     * { Size Method }.
     *
     * @return     { Returns Integer Value }
     */
    public int size() {
        return size;
    }

    /**
     * { Add Method }.
     *
     * @param      items  The items
     */
    public void addAll(final int[] items) {
        for (int i = 0; i < items.length; i++) {
            add(items[i]);
        }
    }
    /**
     * { Get Method }.
     *
     * @param      index  The index
     *
     * @return     { Returns Integer }
     */
    public int get(final int index) {
        if (index < size && index >= 0) {
            return set[index];
        }
        return -1;
    }
    /**
     * { Resize Method }.
     */
    public void resize() {
        set = Arrays.copyOf(set, set.length * 2);
    }
}
