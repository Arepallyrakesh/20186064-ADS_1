import java.util.Scanner;
import java.util.Arrays;
class LinkList{
	private Node firstelem = null;
	LinkList() {
	}
	class Node{
		String element;
		Node nextaddress;
	}
	boolean isempty(){
		return firstelem == null;
	}
	void push(String item) {
		Node oldfirst = firstelem;
		firstelem = new Node();
		firstelem.element = item;
		firstelem.nextaddress = oldfirst;
	}
	String pop(String str) {
		if (isempty() || str != firstelem.element) {
			return null;
		}
		String popitem = firstelem.element;
		firstelem = firstelem.nextaddress;
		return popitem;
	}
	boolean isbalance(String[] s) {
		int countopen = 0;
		int countclosed = 0;
		for (String inp: s) {
			if (inp.equals(")") || inp.equals("]") || inp.equals("}")) {
				countopen++;
			} else if (inp.equals("(") || inp.equals("[") || inp.equals("{")) {
				countclosed++;
			}
		}
		return countopen == countclosed;
	}
}
public class Solution{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		LinkList ll = new LinkList();
		while(input > 0) {
			String[] s = scan.nextLine().split("");
			if(ll.isbalance(s)) {
				
			}
			input--;
		}
		System.out.println(ll.isempty());
	}
}