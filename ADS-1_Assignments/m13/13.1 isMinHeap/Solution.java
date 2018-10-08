import java.util.Scanner;
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		/*System.out.println(line);*/
		Heap h = new Heap();
		switch(line) {
			case "String" :
			int n = sc.nextInt();
			/*System.out.println(n);*/
			/*while(sc.hasNext()) {
				int index = 0;
				String[] st = sc.nextLine().split(",");
				System.out.println(h.checkMinHeap(st, index));
			}*/
			break;
			case "Integer" :
				while(sc.hasNext()) {
					int index = 0;
					String[] integer = sc.nextLine().split(",");
					int[] ints = new int[100000];
					for (int i = 0; i < integer.length; i++) {
						ints[i] += Integer.parseInt(integer[i]);
					}
					System.out.println(h.checkMinHeap(ints, index));
				}
			break;
		}
			
	}
}