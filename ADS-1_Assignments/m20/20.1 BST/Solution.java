import java.util.Scanner;

/**
 * Class for book.
 */
class Book {
    /**
     * book name.
     */
    private String name;
    /**
     * book author.
     */
    private String author;
    /**
     * book price.
     */
    private double price;

    /**
     * Constructs the  for Book class.
     *
     * @param      b    The bookname
     * @param      a  The authorname
     * @param      p   The bookprice
     */
    Book(final String b, final String a,
         final double p) {
        this.name = b;
        this.author = a;
        this.price = p;
    }
    /**
     * getter for name.
     *
     * @return      name of book.
     */
    public String getname() {
        return name;
    }
    /**
     * getter for author.
     *
     * @return      author name.
     */
    public String getauthor() {
        return author;
    }
    /**
     * getter for price.
     *
     *
     * @return     price of book.
     */
    public double getprice() {
        return price;
    }
    /**
     * compare to funtcion.
     *
     * @param      that  The that.
     *
     * @return     integer.
     */
    public int compareTo(final Book that) {

        if (this.getname().compareTo(that.getname()) > 0) {
            return 1;
        } else if (this.getname().compareTo(that.getname()) < 0) {
            return -1;
        } else {
            if (this.getauthor().compareTo(that.getauthor()) > 0) {
                return 1;
            } else if (this.getauthor().compareTo(that.getauthor()) < 0) {
                return -1;
            } else {
                if (this.getprice() > that.getprice()) {
                    return 1;
                } else if (this.getprice() < that.getprice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
    /**
     * tostring method.
     *
     * @return     { description_of_the_return_value }
     */
    public String toString() {
    return this.getname() + ", " + this.getauthor() + ", " + this.getprice();
    }



}
/**
 * Solution class.
 */
public final class Solution {
    /**
     * Constructs the object for checkstyle.
     */
    private Solution() {

    }
    /**
     * main method.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        Bst bst = new Bst();
        while (sc.hasNext()) {
            String[] tokens = sc.nextLine().split(",");

            switch (tokens[0]) {
            case"put":
                bst.put(new Book(tokens[1], tokens[2],
                        Double.parseDouble(tokens[2 + 1])),
                        Integer.parseInt(tokens[2 + 2]));
                break;
            case"get":
                System.out.println(bst.get((new Book(tokens[1],
                    tokens[2], Double.parseDouble(tokens[2 + 1])))));
                break;
            case"min":
                System.out.println(bst.min());
                break;
            case"max":
                System.out.println(bst.max());
                break;
            case"select":
                System.out.println(bst.select(Integer.parseInt(tokens[1])));
                break;
            case"floor":
                System.out.println(bst.floor(new Book(tokens[1], tokens[2],
                            Double.parseDouble(tokens[2 + 1]))));
                break;
            case"ceiling":
                System.out.println(bst.ceiling(new Book(tokens[1], tokens[2],
                        Double.parseDouble(tokens[2 + 1]))));
                break;
            case"deleteMin":
                bst.deleteMin();
                break;
            case"deleteMax":
                bst.deleteMax();
                break;
            case"delete":
                bst.delete(new Book(tokens[1], tokens[2],
                            Double.parseDouble(tokens[2 + 1])));
                break;
            default:
                break;
            }

        }


    }
}
