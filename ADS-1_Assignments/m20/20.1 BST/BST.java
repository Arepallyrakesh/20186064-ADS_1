/**
 * Class for bst.
 */
class Bst {
    /**
     * Class for node.
     */
    private class Node {
        /**
         * book key varoiable.
         */
        private Book key;
        /**
         * valvariable.
         */
        private Integer val;
        /**
         * left node.
         */
        private Node left;
        /**
         * right node.
         */
        private Node right;
        /**
         * count varible.
         */
        private int  count;
        /**
         * Constructs the object.
         *
         * @param      book   The book
         * @param      value  The value
         * @param      size   The size
         */
        Node(final Book book, final Integer value, final int size) {
            this.key = book;
            this.val = value;
            this.left = null;
            this.right = null;
            this.count = size;



        }


    }

    /**
     * root.
     */
    private Node root;
    /**
     * Constructs the object.
     */
    Bst() {
        this.root = null;
    }
    /**
     * size method.
     *
     * @return     { description_of_the_return_value }
     */
    public int size() {
        return size(root);
    }
    /**
     * size for root.
     *
     * @param      x     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public int size(final Node x) {
        if (x == null) {
            return 0;
        } else {
            return x.count;

        }
    }
    /**
     * put function.
     * complexity of put method in average is log N
     * complexity of put method in worst case is N.
     *
     * @param      book    The book
     * @param      quantity  The volume
     */
    public void put(final Book book, final Integer quantity) {
        root = put(root, book, quantity);

    }
    /**
     * helper function.
     *
     * @param      x       { parameter_description }
     * @param      book    The book
     * @param      quantity  The volume
     *
     * @return     { description_of_the_return_value }
     */
    private Node put(final Node x, final Book book,
                               final Integer quantity) {

        if (x == null) {
            return new Node(book, quantity, 1);
        }
        int cmp = book.compareTo(x.key);
        if (cmp < 0) {
            x.left = put(x.left, book, quantity);

        } else if (cmp > 0) {
            x.right = put(x.right, book, quantity);

        } else {
            x.val = quantity;
        }
        x.count = 1 + size(x.left) + size(x.right);
        return x;

    }
    /**
     * get method.
     * complexity of get method in average is log N
     * complexity of get method in worst case is N.
     *
     *
     * @param      book  The book
     *
     * @return     { description_of_the_return_value }
     */
    public Integer get(final Book book) {
        return (get(root, book));

    }
    /**
     * gethelp.
     *
     * @param      x     { parameter_description }
     * @param      book  The book
     *
     * @return     { description_of_the_return_value }
     */
    private Integer get(final Node x, final Book book) {
        if (x == null) {
            return null;
        }
        int cmp = book.compareTo(x.key);
        if (cmp < 0) {
            return  get(x.left, book);

        } else if (cmp > 0) {
            return  get(x.right, book);

        }
        return x.val;
    }

    /**
     * minimum function method.
     *
     * @return     { description_of_the_return_value }
     */
    public Book min() {
        return min(root).key;

    }
    /**
     * min function.
     *
     * @param      x     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public Node min(final Node x) {
        if (x.left == null) {
            return x;
        }
        return min(x.left);

    }
    /**
     * minimum function method.
     *
     * @return     { description_of_the_return_value }
     */
    public Book max() {
        return max(root).key;

    }
    /**
     * max function.
     *
     * @param      x     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public Node max(final Node x) {
        if (x.right == null) {
            return x;
        }
        return max(x.right);

    }

    /**
     * Return the key in the symbol table whose rank is {@code k}.
     * This is the (k+1)st smallest key in the symbol table.
     *
     * @param  k the order statistic
     * @return the key in the symbol table of rank {@code k}
     * @throws IllegalArgumentException unless {@code k} is between 0 and
     *        <em>n</em>–1
     */
    public Book select(final int k) {
        if (k < 0 || k >= size()) {
            throw new IllegalArgumentException("argument  is invalid: " + k);
        }
        Node x = select(root, k);
        return x.key;
    }

    /**
     * select method.
     *
     * @param      x     { parameter_description }
     * @param      k     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    private Node select(final Node x, final int k) {
        if (x == null) {
            return null;
        }
        int t = size(x.left);
        if      (t > k) {
            return select(x.left,  k);
        } else if (t < k) {
            return select(x.right, k - t - 1);
        } else  {
            return x;
        }
    }
    /**
     * Returns the largest key less than or equal to key .
     *
     * @param  key the key
     * @return the largest key in the symbol table less than
     * @throws NoSuchElementException if there is no such key
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public Book floor(final Book key) {
        if (key == null) {
            throw new IllegalArgumentException("argument to floor() is null");
        }
        Node x = floor(root, key);
        if (x == null) {
            return null;
        } else {
            return x.key;
        }
    }
    /**
     * floor function.
     *
     * @param      x     { parameter_description }
     * @param      key   The key
     *
     * @return     { description_of_the_return_value }
     */
    private Node floor(final Node x, final Book key) {
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.key);
        if (cmp == 0) {
            return x;
        }
        if (cmp <  0) {
            return floor(x.left, key);
        }
        Node t = floor(x.right, key);
        if (t != null) {
            return t;
        } else {
            return x;
        }
    }
    /**
     * Returns the smallest key greater than or equal to key.
     *
     * @param  key the key
     * @return the smallest key in the symbol table greater than or equal.
     * @throws NoSuchElementException if there is no such key
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public Book ceiling(final Book key) {
        if (key == null) {
            throw new IllegalArgumentException("argument is null");
        }
        Node x = ceiling(root, key);
        if (x == null) {
            return null;
        } else {
            return x.key;
        }
    }
    /**
     * ceiling function.
     *
     * @param      x     { parameter_description }
     * @param      key   The key
     *
     * @return     { description_of_the_return_value }
     */
    private Node ceiling(final Node x, final Book key) {
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.key);
        if (cmp == 0) {
            return x;
        }
        if (cmp < 0) {
            Node t = ceiling(x.left, key);
            if (t != null) {
                return t;
            } else {
                return x;
            }
        }
        return ceiling(x.right, key);
    }



    /**
     * Removes the smallest key .
     *
     * @throws NoSuchElementException if the symbol table is empty
     */
    public void deleteMin() {
        root = deleteMin(root);
    }
    /**
     * dedleme min function.
     *
     * @param      x     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    private Node deleteMin(final Node x) {
        if (x.left == null) {
            return x.right;
        }
        x.left = deleteMin(x.left);
        x.count = size(x.left) + size(x.right) + 1;
        return x;
    }

    /**
     * Removes the largest key.
     *
     * @throws NoSuchElementException if the symbol table is empty
     */
    public void deleteMax() {
        root = deleteMax(root);
    }
    /**
     * deletemax function.
     *
     * @param      x     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    private Node deleteMax(final Node x) {
        if (x.right == null) {
            return x.left;
        }
        x.right = deleteMax(x.right);
        x.count = size(x.left) + size(x.right) + 1;
        return x;
    }

    /**
     * Removes the specified key.
     *
     * @param  key the key
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public void delete(final Book key) {
        if (key == null) {
            throw new IllegalArgumentException("calls dte() with a null key");
        }
        root = delete(root, key);
    }
    /**
     * delete functin.
     *
     * @param      y     { parameter_description }
     * @param      key   The key
     *
     * @return     { description_of_the_return_value }
     */
    private Node delete(final Node y, final Book key) {
        Node x = y;
        if (x == null) {
            return null;
        }

        int cmp = key.compareTo(x.key);
        if      (cmp < 0) {
            x.left  = delete(x.left,  key);
        } else if (cmp > 0) {
            x.right = delete(x.right, key);
        } else {
            if (x.right == null) {
                return x.left;
            }
            if (x.left  == null) {
                return x.right;
            }
            Node t = x;
            x = min(t.right);
            x.right = deleteMin(t.right);
            x.left = t.left;
        }
        x.count = size(x.left) + size(x.right) + 1;
        return x;
    }

}