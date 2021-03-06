/**
 * Class for separate chaining.
 */
class Ransom {
    /**
     * Word Count in Magazine.
     */
    private int magazineCount;
    /**
     * Word Count in ransom Note.
     */
    private int ransomCount;
    /**
     * LinkedList Array for Hash.
     */
    private LinkedList[] hashing;
    /**
     * Constructs the object.
     *
     * @param      countMagazine        The count
     * @param      countRansom  The count ransom
     */
    Ransom(final int countMagazine, final int countRansom) {
        magazineCount = countMagazine;
        ransomCount = countRansom;
        hashing = new LinkedList[magazineCount];
    }

    /**
     * Hash Code for String.
     *
     * @param      data  The data
     *
     * @return     { description_of_the_return_value }
     */
    public int hash(final String data) {
        return Math.abs(data.hashCode() % magazineCount);
    }
    /**
     * Put Method to put Key, Value pair.
     * Complexity of put is O(N).
     * Because it iterates through out the Linked List.
     *
     * @param      data1  The data 1
     */
    public void put(final String data1) {
        int i = hash(data1);
        if (hashing[i] == null) {
            LinkedList list = new LinkedList();
            hashing[i] = list;
            hashing[i].insertAtHead(data1, 1);
            return;
        }
        for (Node x = hashing[i].head; x != null; x = x.next) {
            if (x.data.equals(data1)) {
                x.value = x.value + 1;
                return;
            }
        }
        hashing[i].insertAtHead(data1, 1);
    }
    /**
     * Get Method to search given key.
     * Complexity of get is O(N).
     * Because it iterates through out the Linked List.
     *
     * @param      data1  The data 1
     *
     * @return     { Returns required Node }
     */
    public String get(final String data1) {
        int i = hash(data1);
        for (Node x = hashing[i].head; x != null; x = x.next) {
            if (x.data.equals(data1)) {
                return x.data;
            }
        }
        return null;
    }

    /**
     * Check Ransom checks each word.
     * Complexity of Check Ransom is O(N).
     * It iterates through out the Linked List to check with given string.
     *
     * @param      data1  The data 1
     *
     * @return     { Returns True is word is in List and value greater
     *              than 0 else returns false }
     */
    public boolean checkRansom(final String data1) {
        int i = hash(data1);
        for (Node x = hashing[i].head; x != null; x = x.next) {
            if (x.data.equals(data1) && x.value > 0) {
                x.value -= 1;
                return true;
            }
        }
        return false;
    }
}
