/**
 * Class for minheap.
 */
class Minheap {
    /**
     * Determines if heap.
     *  Best case:    O(1)
     *  worst case :  O(n)
     *  Average case: O(n)
     *
     * @param      a     { parameter_description }
     *
     * @return     True if heap, False otherwise.
     */
    public boolean isHeap(final Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            if (2 * i + 1 < a.length && 2 * i + 2 < a.length) {
                if (a[i].compareTo(a[2 * i + 1]) > 0
                 || a[i].compareTo(a[2 * i + 2]) > 0) {
                    return false;
                }
            }

        }
        return true;
    }
}
