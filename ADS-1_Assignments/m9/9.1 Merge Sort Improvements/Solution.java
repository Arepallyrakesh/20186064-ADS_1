import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**.
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
        Merge ms = new Merge();
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String tokens = scan.nextLine();
            String[] lines = tokens.split(",");
            ms.sort(lines);
            System.out.println(ms.show(lines));
            System.out.println();

        }
    }
}
