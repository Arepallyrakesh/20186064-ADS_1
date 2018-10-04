import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
  /**
   * Constructs the object.
   */
  private Solution() {

  }
  /**
   * main method to handle input,output and switch cases.
   *
   * @param      args  The arguments
   */
  public static void main(final String[] args) {
    LinkedList object = new LinkedList();
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      String[] tokens = sc.nextLine().split(" ");
      try {
        switch (tokens[0]) {

        case "insertAt" :
          object.insertAt(Integer.parseInt(tokens[1]),
                          Integer.parseInt(tokens[2]));
          object.display();
          break;
        case "reverse":
          object.reverse();
          object.display();
          break;
        default:
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());

      }

    }
  }
}
