/**
 * Class for book.
 */
class Book {
    /**
     * name.
     */
    private String name;
    /**
     * author.
     */
    private String author;
    /**
     * price.
     */
    private Double price;
    /**
     * Constructs the object.
     *
     * @param      n     { parameter_description }
     * @param      a     { parameter_description }
     * @param      p     { parameter_description }
     */
    Book(final String n, final String a, final Double p) {
        this.name = n;
        this.author = a;
        this.price = p;
    }
    /**
     * get name.
     *
     * @return     { description_of_the_return_value }
     */
    String getname() {
        return this.name;
    }
    /**
     * get author.
     *
     * @return     { description_of_the_return_value }
     */
    String getauthor() {
        return this.author;
    }
    /**
     * get price.
     *
     * @return     { description_of_the_return_value }
     */
    Double getprice() {
        return this.price;
    }
    /**
     * compare.
     * best case: O(1)
     * worst case: O(1)
     * Average case: O(1)
     * @param      that  The that
     *
     * @return     { description_of_the_return_value }
     */
    int compareTo(final Book that) {
        if (this.name.compareTo(that.name) > 0) {
            return 1;
        } else if (this.name.compareTo(that.name) < 0) {
            return -1;
        } else {
            if (this.author.compareTo(that.author) > 0) {
                return 1;
            } else if (this.author.compareTo(that.author) < 0) {
                return -1;
            } else {
                if (this.price.compareTo(that.price) > 0) {
                    return 1;
                } else if (this.price.compareTo(that.price) < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
}
