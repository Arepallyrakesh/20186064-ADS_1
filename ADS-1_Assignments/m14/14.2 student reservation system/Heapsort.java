
/**
 * Class for heapsort.
 */
class Heapsort {
    /**
     * array.
     */
    private Details[] array;
    /**
     * size.
     */
    private int size;
    /**
     * Constructs the object.
     *
     * @param      a     { parameter_description }
     * @param      n     { parameter_description }
     */
    Heapsort(final Details[] a, final int n) {
        array = a;
        size = n;
    }
    /**
     * sorts.
     * Best case: O(N)
     *  worst case: O(N)
     *  Average case: O(N)
     * @return     { description_of_the_return_value }
     */
    Details[] sort() {
        for (int i = (size / 2) - 1; i >= 0; i--) {
            heapify(size, i);
        }
        for (int i = size - 1; i >= 0; i--) {
            swap(0, i);
            heapify(i, 0);
        }
        return array;
    }
    /**
     * swaps.
     *  Best case: O(1)
     *  worst case: O(1)
     *  Average case: O(1)
     * @param      i     { parameter_description }
     * @param      j     { parameter_description }
     */
    void swap(final int i, final int j) {
        Details temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    /**
     * heapifies.
     *  Best case: O(logN)
     *  worst case: O(logN)
     *  Average case: O(logN)
     * @param      n     { parameter_description }
     * @param      i     { parameter_description }
     */
    void heapify(final int n, final int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && array[l].compareTo(array[largest]) < 0) {
            largest = l;
        }
        if (r < n && array[r].compareTo(array[largest]) < 0) {
            largest = r;
        }
        if (largest != i) {
            swap(i, largest);
            heapify(n, largest);
        }
    }
    /**
     * gets item.
     *
     * Best case: O(1)
     *  worst case: O(1)
     *  Average case: O(1)
     * @param      index  The index
     *
     * @return     { description_of_the_return_value }
     */
    Details getitem(final int index) {
        return array[index];
    }
    /**
     * get size.
     *
     * Best case: O(1)
     *  worst case: O(1)
     *  Average case: O(1)
     * @return     { description_of_the_return_value }
     */
    int getsize() {
        return size;
    }
}
