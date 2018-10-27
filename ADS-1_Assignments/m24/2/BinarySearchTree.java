/**

 * Class for binary search tree.

 */

class BinarySearchTree {
    class Node {

      
        private Student key;
        private String value;
        private Node left;
        private Node right;

        
        Node(final Student k, final String v) {

            this.key = k;
            this.value = v;
            this.left = null;
            this.right = null;

        }

    }

 
    private Node root;

    BinarySearchTree() {

        root = null;

    }

    public void put(final Student key, final String value) {

        root = put(root, key, value);

    }

    private Node put(final Node x, final Student key, final String value) {
        if (x == null) {
            return new Node(key, value);
        }
        int cmp = key.compareTo(x.key);
        if (cmp <= 0) {
            x.left = put(x.left, key, value);
        } else {
            x.right = put(x.right, key, value);
        }
        return x;

    }

    void get(Node x, Double k1, Double k2) { 

        if (x == null) { 

            return; 

        } 

        if (k1 < x.key.getMarks()) { 

            get(x.left, k1, k2); 

        } 

        if (k1 <= x.key.getMarks() && k2 >= x.key.getMarks()) { 

            System.out.println(x.value); 
        } 
        if (k2 > x.key.getMarks()) { 

            get(x.right, k1, k2); 

        } 

    }

    void getBE(Double k1, Double k2) {

        get(root, k1, k2);

    }

    void getLE(Double k) {

        get(root, 0.0, k);

    }
    
}
