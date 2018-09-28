import java.util.Scanner;
public class Solution{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Operations ll = new Operations();
		while(scan.hasNext()) {
			String[] s = scan.nextLine().split(" ");
			if (s[0].equals("pushstart")) {
				ll.pushstart(s[1]);
			} else if (s[0].equals("pushend")) {
				ll.pushend(s[1]);
			} else if (s[0].equals("popstart")) {
				System.out.println(ll.popstart());
			} else if (s[0].equals("popend")) {
				System.out.println(ll.popend());
			} else if (s[0].equals("print")) {
				ll.print();
			}
		}
	}
}