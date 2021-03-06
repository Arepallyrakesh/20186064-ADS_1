/**
 * Class for Leaderboard.
 */
public class Leaderboard {
    /**
     *It's a default constructor.
     */
    public Leaderboard() {

    }
    public void Sort(Comparable[] array, int size) {
        int n = size;
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (more(array, j, j - 1)) {
                    swap(array, j, j - 1);
                }
            }
        }
    }
    public boolean more(Comparable[] arr, int ind1, int ind2) {
        return arr[ind1].compareTo(arr[ind2]) > 0;
    }
    public void swap(Comparable[] a, int ind1, int ind2) {
        Comparable temp = a[ind1];
        a[ind1] = a[ind2];
        a[ind2] = temp;
    }
    public String leaderboard(Comparable[] array, int size) {
        Sort(array, size);
        String s = "";
        for (int i = 0; i < size; i++) {
            s += array[i].toString() + ",";
        }
        return s.substring(0, s.length() - 1);
    }
}