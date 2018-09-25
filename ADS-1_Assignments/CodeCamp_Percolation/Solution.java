import java.util.Scanner;

/**
 * Class for solution.
 */
public class Solution {

    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        Percolate obj = new Percolate(input);
        while (sc.hasNextLine()) {
            String[] inputs = sc.nextLine().split(" ");
            obj.open(Integer.parseInt(inputs[0]) - 1,
                Integer.parseInt(inputs[1]) - 1);
        }
        System.out.println(obj.ispercolate());
    }
}

/**
 * Class for percolate.
 */
class Percolate {
    /**
     * grid description.
     */
    private boolean[][] grid;
    /**
     * WeightedQuickUnionUF description.
     */
    private WeightedQuickUnionUF obj;
    /**
     * size description.
     */
    private int size;

    /**
     * Constructs the object.
     *
     * @param      siz  The size
     */
    Percolate(final int siz) {
        this.size = siz;
        grid = new boolean[siz][siz];
        obj = new WeightedQuickUnionUF(siz * siz + 2);
    }

    /**
     * { function_description }.
     *
     * @param      row1     The row1
     * @param      column1  The column1
     */
    public void open(final int row1, final int column1) {
        if (grid[row1][column1]) {
            return;
        }
        grid[row1][column1] = true;
        if (row1 == 0) {
            obj.union(convert(row1, column1), size * size);
        }
        if (row1 == size - 1) {
            obj.union(convert(row1, column1), size * size + 1);
        }
        if (row1 < size - 1 && grid[row1 + 1][column1]) { //bottom element
            obj.union(convert(row1, column1), convert(row1 + 1, column1));
        }
        if (row1 > 0 && grid[row1 - 1][column1]) { //top element
            obj.union(convert(row1, column1), convert(row1 - 1, column1));
        }
        if (column1 > 0 && grid[row1][column1 - 1]) { //left element
            obj.union(convert(row1, column1), convert(row1, column1 - 1));
        }
        if (column1 < size - 1 && grid[row1][column1 + 1]) { //right element
            obj.union(convert(row1, column1), convert(row1, column1 + 1));
        }
    }

    /**
     * { function_description }.
     *
     * @return     { description_of_the_return_value }
     */
    public boolean ispercolate() {
        return obj.connected(size * size, size * size + 1);
    }

    /**
     * { function_description }.
     *
     * @param      i     { parameter_description }
     * @param      j     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public int convert(final int i, final int j) {
        return i * size + j;
    }
}

