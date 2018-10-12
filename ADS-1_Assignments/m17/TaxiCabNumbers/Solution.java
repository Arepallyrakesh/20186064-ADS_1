import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        CubeSum obj = new CubeSum();
        Scanner sc = new Scanner(System.in);
        String[] n = sc.nextLine().split(" ");
        int n1 = Integer.parseInt(n[0]);
        int n2 = Integer.parseInt(n[1]);
        System.out.println(obj.findCubeSum(n1, n2));
    }
}
