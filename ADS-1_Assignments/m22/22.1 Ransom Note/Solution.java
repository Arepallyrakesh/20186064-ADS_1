import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //It is a defaul constructor.
    }
    /**
     * Main Method for Solution.
     * Complexity of Solution is O(N).
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = scan.nextLine().split(" ");
        int magazinecount = Integer.parseInt(arr[0]);
        int ransomcount = Integer.parseInt(arr[1]);
        String[] magazineWords = scan.nextLine().split(" ");
        Ransom chain = new Ransom(magazinecount, ransomcount);
        for (int i = 0; i < magazinecount; i++) {
            chain.put(magazineWords[i]);
        }
        String[] ransomWords = scan.nextLine().split(" ");
        for (int i = 0; i < ransomcount; i++) {
            if (chain.checkRansom(ransomWords[i])) {
                continue;
            } else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}