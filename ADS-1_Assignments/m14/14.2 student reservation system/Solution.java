import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for solution.
 */
final class Solution {
    /**    
     * Constructs the object.
     */
    private Solution() {
        ///function.
    }
    /**
     * contains.
     *
     * @param      arr   The arr
     * @param      val   The value
     * Best case: O(1)
     *  worst case: O(N)
     *  Average case: O(N)
     * @return     { description_of_the_return_value }
     */
    static boolean contains(final int[] arr, final int val) {
        for (int n : arr) {
            if (val == n) {
                return true;
            }
        }
        return false;
    }

    /**
     * main.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int vacancies = Integer.parseInt(scan.nextLine());
        int open = Integer.parseInt(scan.nextLine());
        int bc = Integer.parseInt(scan.nextLine());
        int sc = Integer.parseInt(scan.nextLine());
        int st = Integer.parseInt(scan.nextLine());
        Details[] students = new Details[n];
        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(",");
            students[i] = new Details(input[0], input[1],
            Integer.parseInt(input[2]),
                    Integer.parseInt(input[2 + 1]),
                    Integer.parseInt(input[2 + 2]),
                    Integer.parseInt(input[2 + 2 + 1]), input[2 + 2 + 2]);
        }
        Heapsort heap = new Heapsort(students, n);
        students = heap.sort();
        for (int i = 0; i < n; i++) {
            System.out.println(students[i].print());
        }
        System.out.println();
        for (int j = 0; j < open; j++) {
            System.out.println(students[j].print());
        }
        int[] indices = new int[bc + sc + st];
        int i = 0;
        for (int k = open; k < n; k++) {
            if (students[k].getcategory().equals("BC") && bc > 0) {
                indices[i++] = k;
                bc--;
            } else if (students[k].getcategory().
                       equals("SC") && sc > 0) {
                indices[i++] = k;
                sc--;
            } else if (students[k].getcategory().
                       equals("ST") && st > 0) {
                indices[i++] = k;
                st--;
            }  
        }
        if (bc > 0) {
            for (int k = open; k < n; k++) {
                if (students[k].getcategory().equals("Open") && bc > 0) {
                    if (!contains(indices, k)) {
                        indices[i++] = k;
                        bc--;
                    }
                }
            }
        }
        if (sc > 0) {
            for (int k = open; k < n; k++) {
                if (students[k].getcategory().equals("Open") && sc > 0) {
                    if (!contains(indices, k)) {
                        indices[i++] = k;
                        sc--;
                    }
                }
            }
        }
        if (st > 0) {
            for (int k = open; k < n; k++) {
                if (students[k].getcategory().equals("Open") && st > 0) {
                    if (!contains(indices, k)) {
                        indices[i++] = k;
                        st--;
                    }
                }
            }
        }
        Arrays.sort(indices);
        for (int k = 0; k < indices.length; k++) {
            System.out.println(students[indices[k]].print());
        }
    }
}
