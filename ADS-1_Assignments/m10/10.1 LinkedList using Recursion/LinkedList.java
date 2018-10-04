/**
 * List of linkeds.
 */
class LinkedList {
  /**
   * Class for node.
   */
  private class Node {
    /**
     * variable value.
     */
    private int value;
    /**
     * variable next.
     */
    private Node next;
    /**
     * Constructs the object.
     */
    Node() {

    }
    /**
     * Constructs the object.
     *
     * @param      data  The value
     */
    Node(final int data) {
      this.value = data;
      this.next = next;
    }
  }
  /**
   * varaible head.
   */
  private Node head;
  /**
   * variable tail.
   */
  private Node tail;
  /**
   * variable size.
   */
  private int size;
  /**
   * Constructs the object.
   */
  LinkedList() {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }
  /**
   * this function is used to insert given value at given index.
   * Complexity of this function is O(N) as it is a reccursive.
   * function.
   *
   * @param      index      The index
   * @param      value      The value
   *
   * @throws     Exception  throws exception if index is not valid.
   */
  public void insertAt(final int index, final int value)  {

    head = insertAt(head, new Node(value), index, 0);
    size++;
  }
  /**
   * this is a overloaded method.
   *Complexity of this function is O(N) as it is a reccursive.
   * function.
   * @param      currNode     The curr
   * @param      newNode    The new node
   * @param      index      The index
   * @param      currIndex  The curr index
   *
   * @return     returns a node to its overloaded method.
   */
  private Node insertAt(final Node currNode,
                        final Node newNode,
                        final int index, final int currIndex) {
    if (currNode == null) {
      return newNode;
    } else if (currIndex == index) {
      newNode.next = currNode;
      return newNode;
    }

    currNode.next = insertAt(currNode.next, newNode, index, currIndex + 1);
    return currNode;

  }
  /**
   * this method reverses the present linked list.
   * Time complexity for this method is O(N).
   * @throws     Exception  it throws no element to reverse exception.
   */

  public void reverse() throws Exception {
    if (size == 0) {
      throw new Exception("No elements to reverse.");
    }
    reverse(head, null);

  }
  /**
   * overloaded methos for reverse.
   *
   * @param      curr  The curr
   * @param      prev  The previous
   *
   * @return     returns the Node.
   */
  private Node reverse(final Node curr, final Node prev) {



    if (curr.next == null) {
      head = curr;
      head.next = prev;
      return null;
    }

    Node temp = curr.next;
    curr.next = prev;

    reverse(temp, curr);
    return head;
  }
  /**
   * prints the linked list.
   */
  public void display() {
    Node curr = head;
    String result = "";
    while (curr != null) {
      if (curr.next == null) {
        result += curr.value;
      } else {
        result += curr.value + ", ";
      }
      curr = curr.next;
    }

    System.out.println(result);
  }
}