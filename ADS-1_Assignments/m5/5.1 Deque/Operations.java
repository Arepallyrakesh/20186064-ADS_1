import java.util.Scanner;
class Node {
	String value;
	Node address;
}
class Operations {
	Node last, first;
	boolean isempty() {
		return first == null;
	}
	void pushstart(String item) {

		Node oldfirst = first;
		
		first = new Node();
		first.value = item;
		
		first.address = oldfirst;
		if (isempty()) {
			last = first;
			System.out.println(last.value);
		}
	}
	void pushend(String item) {
		
		Node oldlast = last;
		
		last = new Node();
		last.value = item;
		/*System.out.println(last.value+":last.value");*/
		last.address = null;
		if (isempty()) {
			/*System.out.println(first+":first");*/
			first = last;
		} else {
			
			oldlast.address = last;
			
		}
	}
	String popstart() {
		if (isempty()) {
			return null;
		}
		String popitem = first.value;
		first = first.address;
		return popitem;
	}
	String popend() {
		if (isempty()) {
			return null;
		}
		String popitem = last.value;
		Node temp = first;
		Node empty;
		while(temp.address != null) {
			temp = temp.address;
		}
		last = temp;
		return popitem;
	}
	void print() {
		Node temp = first;
	 	while(temp.address != null){
	 		System.out.print(temp.value + ", ");
	 		temp = temp.address;
	 	}
	 	System.out.println(temp.value);
	}
}
/*public class Linkedlist{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Linkedlst ll = new Linkedlst();
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
}*/