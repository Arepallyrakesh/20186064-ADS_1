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
        Student[] student = new Student[100];
        int size = 0;
        Scanner scan = new Scanner(System.in);
        Leaderboard t = new Leaderboard();
        int n = scan.nextInt();
        int v = scan.nextInt();
        int unres = scan.nextInt();
        int bc = scan.nextInt();
        int sc = scan.nextInt();
        int st = scan.nextInt();
/*        System.out.print(n);
        System.out.print(v);
        System.out.print(unres);
        System.out.print(bc);
        System.out.print(sc);
        System.out.print(st);*/

        while (scan.hasNext()) {
            String[] line = scan.nextLine().split(",");
            /*System.out.println(Arrays.toString(line));*/

            if (line.length > 1) {
                student[size++] = new Student(line[0], line[1],
                     Integer.parseInt(line[2]), Integer.parseInt(line[THREE]), Integer.parseInt(line[4]),Integer.parseInt(line[5]), line[6]);
                /*System.out.println(Arrays.toString(student));*/

        }
        }
        System.out.println(t.leaderboard(student, size ));
        
        String[] s = t.leaderboardof(student,size).split(" ");
        /*System.out.println(s);*/
        for (int i = 0; i<= unres+1 ;i++ ) {
            System.out.println(s[i]);
            
        }





    }
}
