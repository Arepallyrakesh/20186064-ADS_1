import java.util.Scanner;
/**
 * Class for LinkedList.
 */
class LinkedList1 {
    /**
     * {Initializing Nodeclass Firstelement}.
     */
    private Node firstelement = null;
    /**
     * Class for node.
     */
    private class Node {
        /**
         * {initializing char item}.
         */
        private char item;
        /**
         * {initializing nextAddress}.
         */
        private Node nextAddress;
    }

    /**
     * { function_description }.
     *
     * @return     { description_of_the_return_value }
     */
    public char top() {
        return firstelement.item;
    }


    /**
     * Determines if empty.
     *
     * @return     True if empty, False otherwise.
     */
    public boolean isEmpty() {
        return firstelement == null;
    }
    /**
     * { function_description }.
     *
     * @param      item  The item
     */
    public void push(final char item) {
        Node oldfirst = firstelement;
        firstelement = new Node();
        firstelement.item = item;
        firstelement.nextAddress = oldfirst;
    }
    /**
     * { function_description }.
     *
     * @return     { description_of_the_return_value }
     */
    public char pop() {
        char item = firstelement.item;
        firstelement = firstelement.nextAddress;
        return item;
    }
    public String displayAll() {
            String s = "";
            Node temp = firstelement;
            while (temp != null) {
                s += temp.item;
                temp = temp.nextAddress;
            }
            return s.substring(0, s.length());
        }
        
}
