/**
 * Class for merge.
 */
class Merge {
    private static final int CUTOFF = 7;

    /**
     * Constructs the object.
     */
    Merge() { 

    }

    /**
     * { function_description }
     *
     * Time complexity of this method is O(N).
     * @param      array     The array
     * @param      newarray  The newarray
     * @param      lo        The lower
     * @param      mid       The middle
     * @param      hi        The higher
     */
    private static void merge(Comparable[] array, Comparable[] newarray, int lo, int mid, int hi) {
        assert isSorted(array, lo, mid);
        assert isSorted(array, mid+1, hi);

        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                newarray[k] = array[j++];
            }              
                
            else if (j > hi) {
                newarray[k] = array[i++];
            }              
             
            else if (less(array[j], array[i])) {
                newarray[k] = array[j++];
            }
            else {
                newarray[k] = array[i++];
            }
        }
        assert isSorted(newarray, lo, hi);
    }

    /**
     * { function_description }.
     * Best case: O(log N)
     * Average case : O(logN)
     * worst case :O(log N)
     *
     * @param      array     The array
     * @param      newarray  The newarray
     * @param      lo        The lower
     * @param      hi        The higher
     */
    private static void sort(Comparable[] array, Comparable[] newarray, int lo, int hi) {
        if (hi <= lo + CUTOFF) { 
            insertionSort(newarray, lo, hi);
            System.out.println("Insertion sort method invoked...");
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(newarray, array, lo, mid);
        sort(newarray, array, mid+1, hi);

        if (!less(array[mid+1], array[mid])) {
           for (int i = lo; i <= hi; i++) { 
            newarray[i] = array[i];
            }
            System.out.println("Array is already sorted. So, skipped the call to merge...");
           return;
        }
        merge(array, newarray, lo, mid, hi);
    }

    /**
     * { function_description }
     * * sorts.
     *
     * @param      a     { parameter_description }
     */
    public static void sort(Comparable[] a) {
        Comparable[] aux = a.clone();
        sort(aux, a, 0, a.length-1);  
        assert isSorted(a);
    }

    /**
     * { function_description }
     * Best case: O(N)
     * Average case : O(N^2/2)
     * worst case :O(N^2)
     *
     * @param      a     { parameter_description }
     * @param      lo    The lower
     * @param      hi    The higher
     */
    public static void insertionSort(Comparable[] a, int lo, int hi) {
        for (int i = lo; i <= hi; i++)
            for (int j = i; j > lo && less(a[j], a[j-1]); j--)
                exch(a, j, j-1);
    }

    /**
     * { function_description }
     * Best case: O(1)
     * Average case : O(1)
     * worst case :O(1)
     *
     * @param      a     { parameter_description }
     * @param      i     { parameter_description }
     * @param      j     { parameter_description }
     */
    public static void exch(Comparable[] a, int i, int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    /**
     * { function_description }.
     * Best case: O(1)
     * Average case : O(1)
     * worst case :O(1)
     *
     * @param      a     { parameter_description }
     * @param      b     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    /**
     * Determines if sorted.
     * Best case: O(1)
     * Average case : O(1)
     * worst case :O(1)
     *
     *
     * @param      a     { parameter_description }
     *
     * @return     True if sorted, False otherwise.
     */
    public static boolean isSorted(Comparable[] a) {
        return isSorted(a, 0, a.length - 1);
    }

    /**
     * Determines if sorted.
     * Best case: O(1)
     * Average case : O(n)
     * worst case :O(N).
     *
     * @param      a     { parameter_description }
     * @param      lo    The lower
     * @param      hi    The higher
     *
     * @return     True if sorted, False otherwise.
     */
    public static boolean isSorted(Comparable[] a, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++)
            if (less(a[i], a[i-1])) {
                return false;
            }
        return true;
    }

    /**
     * { function_description }
     *
     * @param      a     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public static Object show(Object[] a) {
        String s = "[";
        int i;
        for (i = 0; i < a.length - 1; i++) {
            s += a[i] + ", ";
        }
        s = s + a[a.length - 1] + "]";
        return s;
    }
}