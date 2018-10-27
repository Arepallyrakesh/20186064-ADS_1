import java.util.Scanner;
import java.util.HashMap;

class Solution {
	Solution() {

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		int m = Integer.parseInt(n);
		HashMap<Integer, Student> hmap = new HashMap<Integer, Student>(m);
		for(int i = 0; i < m; i++) {
			String[] token = sc.nextLine().split(",");
			hmap.put(Integer.parseInt(token[0]), new Student(token[1], Double.parseDouble(token[2])));

		}
		String a = sc.nextLine();
		int b = Integer.parseInt(a);
		for(int i = 0; i < b; i++) {
			String[] token = sc.nextLine().split(" ");
			Student student = hmap.get(Integer.parseInt(token[1]));

			if(student == null){

				System.out.println("Student doesn't exists...");

			} else if(token[2].equals("1")) {

					System.out.println(student.getName());

			} else if(token[2].equals("2")) {
				System.out.println(student.getName());
			}

			

		}

	}

}
		