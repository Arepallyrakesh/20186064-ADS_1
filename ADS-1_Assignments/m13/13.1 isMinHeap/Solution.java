import java.util.Scanner;
/**
 * Class for solution.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * main.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        int ntcases = sc.nextInt();
        Minheap m = new Minheap();
        sc.nextLine();
        for (int i = 0; i < ntcases; i++) {
            String line = sc.nextLine();
            if (line.length() == 0) {
                System.out.println("false");
            } else {
                String[] input = line.split(",");
                switch (type) {
                case "String":
                    size  = 0;
                    String[] stringheap = new String[input.length];
                    for (int j = 0; j < input.length; j++) {
                        stringheap[size++] = input[j];
                    }
                    System.out.println(m.isHeap(stringheap));
                    break;
                case "Integer":
                    size = 0;
                    Integer[] intheap = new Integer[input.length];
                    for (int j = 0; j < input.length; j++) {
                        intheap[size++] = Integer.parseInt(input[j]);
                    }
                    System.out.println(m.isHeap(intheap));
                    break;
                case "Float":
                    size = 0;
                    Float[] floatheap = new Float[input.length];
                    for (int j = 0; j < input.length; j++) {
                        floatheap[size++] = Float.parseFloat(input[j]);
                    }
                    System.out.println(m.isHeap(floatheap));
                    break;
                case "Double":
                    size = 0;
                    Double[] doubleheap = new Double[input.length];
                    for (int j = 0; j < input.length; j++) {
                        doubleheap[size++] = Double.parseDouble(input[j]);
                    }
                    System.out.println(m.isHeap(doubleheap));
                    break;
                default:
                    break;
                }
            }
        }
    }
}
