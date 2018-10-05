import java.util.Scanner;
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
	String pop() {
		String popitem = firstelem.element;
		firstelem = firstelem.nextaddress;
		return popitem;
	}
}
public class Solution{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkList ll = new LinkList();
		while(scan.hasNext()) {
			String s = scan.nextLine();
			if (s.equals("-")) {
				ll.pop();
			} else {
				ll.push(s);
			}
		}
	}
}


