import java.util.Comparator;
/**
 * Class for minimum pq.
 *
 * @param      <Key>  The key.
 */
public class  MinPQ<Key> {
	/**
	 * key array of type.
	 */
	public Key[] pq;
	/**
	 * size of key array.
	 */
	public int n;
	/**
	 * comparator for comparing data types.
	 */
	public Comparator<Key> comparator;
	/**
	 * Constructs the object.
	 *
	 * @param      initCapacity  The initialize capacity.
	 */
	public  MinPQ(int initCapacity) {
		pq = (Key[]) new Object[initCapacity + 1];
		n = 0;
	}
	/**
	 * Constructs the object.
	 */
	public  MinPQ() {
		this(1);
	}
	public boolean greater(int i, int j) {
		if (comparator == null) {
			return ((Comparable<Key>) pq[i]).compareTo(pq[j]) > 0;
		} else {
			return comparator.compare(pq[i], pq[j]) > 0;
		}
	}

	

	public boolean isMinHeap() {
		return isMinHeap(1);
	}
	/*
	 * Determines if heap.
     *  Best case: O(1)
     *  worst case :O(n)
     *  Average case: O(n)
	 *  
	 */

	public boolean isMinHeap(int k) {
		if (k > n) return true;
		int left = 2 * k;
		int right = 2 * k + 1;
		if (left  <= n && greater(k, left))  return false;
		if (right <= n && greater(k, right)) return false;
		return isMinHeap(left) && isMinHeap(right);
	}
}