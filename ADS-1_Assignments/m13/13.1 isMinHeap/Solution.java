import java.util.Scanner;

/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() { }
    /**
     * compare.
     *
     * @param      pq    priority queue.
     * @param      str   The string.
     *
     * @return     {compare it}.
     */
    public static boolean compare(final String pq, final String str) {
        return pq.equals(str);
    }
    /**
     * main.
     *
     * @param      args  The arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chk = sc.nextLine();
        switch (chk) {
            case "String" :
            int num = sc.nextInt();
            sc.nextLine();
            while (sc.hasNext()) {
                String line = sc.nextLine();
                String str = "";
                MinPQ<String> pq = new MinPQ<String>();
                if (line.length() != 0) {
                    String[] token = line.split(",");
                    for (int j = 0; j < token.length; j++) {
                        pq.insert(token[j]);
                        str += token[j];
                    }
                    System.out.println(compare(pq.show(), str));
                } else {
                    System.out.println("false");
                }
            }
            break;
            case "Float" :
            int numf = sc.nextInt();
            sc.nextLine();
            while(numf > 0) {
                String line = sc.nextLine();
                String str = "";
                MinPQ<Float> pq = new MinPQ<Float>();
                if (line.length() != 0) {
                    String[] token = line.split(",");
                    Float[] floatarray = new Float[token.length];
                    for (int j = 0; j < token.length; j++) {
                        floatarray[j] = Float.parseFloat(token[j]);
                        pq.insert(floatarray[j]);
                        str += floatarray[j];
                    }
                    System.out.println(compare(pq.show(), str));
                } else {
                    System.out.println("false");
                }
                numf--;
            }

            break;
            case "Double" :
            int numD = sc.nextInt();
            sc.nextLine();
            while(sc.hasNext()) {
                String line = sc.nextLine();
                String str = "";
                MinPQ<Double> pq = new MinPQ<Double>();
                if (line.length() != 0) {
                    String[] token = line.split(",");
                    Double[] doublearray = new Double[token.length];
                    for (int k = 0; k< token.length; k++) {
                        doublearray[k] = Double.parseDouble(token[k]);
                        pq.insert(doublearray[k]);
                        str += doublearray[k];
                        }
                    System.out.println(compare(pq.show(), str));
                } else {
                    System.out.println("false");
                }
            }
            break;
            case "Integer" :
            int numI = sc.nextInt();
            sc.nextLine();
            while(sc.hasNext()) {
                String line = sc.nextLine();
                String str = "";
                MinPQ<Integer> pq = new MinPQ<Integer>();
                if (line.length() != 0) {
                    String[] token = line.split(",");
                    Integer[] integerarray = new Integer[token.length];
                    for (int k = 0; k < token.length; k++) {
                        integerarray[k] = Integer.parseInt(token[k]);
                        pq.insert(integerarray[k]);
                        str += integerarray[k];
                    }
                    System.out.println(compare(pq.show(), str));
                } else {
                    System.out.println("false");
                }
            }
            break;
        default:
            break;
        }

    }
}