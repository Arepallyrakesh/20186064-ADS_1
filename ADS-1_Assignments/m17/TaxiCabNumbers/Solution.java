import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
/**
 * Class for solution.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //unused constructor.
    }
    /**
     * taxinumber.
     * Best case: (N)
     * Worst case: (N)
     * Average case: (N)
     * @param      list  The list
     * @param      n     { parameter_description }
     * @param      m     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    static int taxinumber(final ArrayList<CubeSum> list,
            final int n, final int m) {
        int i = 0, k = n;
        int res = 0;
        while (k > 0 && i < list.size() - m + 1) {
            ArrayList<CubeSum> sublist =
                new ArrayList<CubeSum>(list.subList(i, i + m));
            i++;
            HashSet<Integer> set = new HashSet<Integer>();
            for (CubeSum each : sublist) {
                set.add(each.getsum());
            }
            if (set.size() == 1) {
                res = sublist.get(0).getsum();
                k--;
                // System.out.println(set);
            }
        }
        return res;
    }
    /**
     * main.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {

        final int num = 525;
        Scanner sc = new Scanner(System.in);
        ArrayList<CubeSum> cubelist = new ArrayList<CubeSum>();
        // initialize priority queue
        MinPQ<CubeSum> pq = new MinPQ<CubeSum>();
        for (int i = 1; i <= num; i++) {
            pq.insert(new CubeSum(i, i));
        }

        // find smallest sum, print it out, and update
        while (!pq.isEmpty()) {
            CubeSum s = pq.delMin();
            cubelist.add(s);
            if (s.getj() < num) {
                pq.insert(new CubeSum(s.geti(), s.getj() + 1));
            }
        }
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(taxinumber(cubelist, n, m));
    }
}
