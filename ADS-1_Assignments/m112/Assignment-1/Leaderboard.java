import java.util.*;
/**.
 * Class for table.
 */
public class Leaderboard {
    /**.
     * Constructs the object.
     */
    public Leaderboard() {

    }
 
    public void Sort(Comparable[] array, int size) {
        int n = size;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (less(array, i, j)) {
                    swap(array, j, min);
                }
            }
        }
    }

    public boolean less(Comparable[] arr, int index1, int index2) {
        return arr[index1].compareTo(arr[index2]) < 0;
    }
 
    public void swap(Comparable[] a, int index1, int index2) {
        Comparable temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
 
    public String leaderboard(Comparable[] array, int size) {
        Sort(array, size);
        String s = "";
        /*System.out.println(Arrays.toString(array));*/
        /*s += array[1].toString();*/
        for (int i = 0; i < size; i++) {
            s += array[i].toString() + "\n";
        }
        return s.substring(0, s.length());
    }
}