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
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        BinarySearchST<String, Integer> obj = new
            BinarySearchST<String, Integer>();
        for (int i = 0; i < line.length; i++) {
            obj.put(line[i], i);
        }
        /*System.out.println(line);*/
        while (sc.hasNext()) {
            String[] token = sc.nextLine().split(" ");
            /*System.out.println(token);*/
            if (token[0].equals("deleteMin")) {
                obj.deleteMin();
            } else if (token[0].equals("max")) {
                System.out.println(obj.max());
            } else if (token[0].equals("floor")) {
                System.out.println(obj.floor(token[1]));
            } else if (token[0].equals("rank")) {
                System.out.println(obj.rank(token[1]));
            } else if (token[0].equals("contains")) {
                System.out.println(obj.contains(token[1]));
            } else if (token[0].equals("get")) {
                System.out.println(obj.get(token[1]));
            } else if (token[0].equals("keys")) {
                obj.keys();
            }
        }

    }
}
