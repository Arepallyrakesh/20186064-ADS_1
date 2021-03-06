/**
 * Class for cube sum.
 */
class CubeSum implements Comparable<CubeSum> {
    /**
     * sum variable.
     */
    private final int sum;
    /**
     * int i variable.
     */
    private  final int i;
    /**
     * int j varibale.
     */
    private final int j;
    /**
     * Constructs the object.
     *
     * @param      in     { parameter_description }
     * @param      ja    { parameter_description }
     */
    CubeSum(final int a, final int b) {
        this.sum = a * a * a+ b * b * b;
        this.i = a;
        this.j = b;
    }
    /**
     * geti method.
     *
     * @return     { description_of_the_return_value }
     */
    int geti() {
        return this.i;
    }
    /**
     * getj method.
     *
     * @return     { description_of_the_return_value }
     */
    int getj() {
        return this.j;
    }
    /**
     * getsum method.
     *
     * @return     { description_of_the_return_value }
     */
    int getsum() {
        return this.sum;
    }
    /**
     * compareTo method.
     * Best case: O(1)
     * Worst case: O(1)
     * Average case: O(1)
     * @param      that  The that
     *
     * @return     { description_of_the_return_value }
     */
    public int compareTo(final CubeSum that) {
        if (this.sum < that.sum) {
            return -1;
        }
        if (this.sum > that.sum) {
            return +1;
        }

        return 0;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return sum + " = " + i + "^3" + " + " + j + "^3";
    }
}
