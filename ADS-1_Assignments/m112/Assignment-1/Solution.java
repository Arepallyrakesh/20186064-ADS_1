import java.util.Scanner;
import java.util.*;
/**.
 *Class for Solution.
 */
public final class Solution {
    /**.
     * Magic Number.
     */
    private static final int TEN = 10;
    /**.
     * Magic Number.
     */
    private static final int THREE = 3;
    /**.
     * Constructs the object.
     */
    private Solution() {
    }

    /**.
     *Main function to handle test cases and deliver required output.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Student[] student = new Student[25];
        int size = 0;
        Scanner scan = new Scanner(System.in);
        Leaderboard t = new Leaderboard();
        while (scan.hasNext()) {
            String[] line = scan.nextLine().split(",");
            System.out.println(Arrays.toString(line));
            if (line.length > 1) {
                student[size++] = new Student(line[0], line[1],
                     Integer.parseInt(line[2]), Integer.parseInt(line[THREE]), Integer.parseInt(line[4]),Integer.parseInt(line[5]), line[6]);
                /*System.out.println(Arrays.toString(student));*/
                

        }
        }
        System.out.println(t.leaderboard(student, size ));
    }
}
