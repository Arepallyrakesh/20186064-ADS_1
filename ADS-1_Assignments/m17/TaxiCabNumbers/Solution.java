import java.util.*;
class Solution {
	public static void main(String[] args) {
		CubeSum obj = new CubeSum();
		Scanner sc= new Scanner(System.in);
        String[] n = sc.nextLine().split(" ");
        int n1 = Integer.parseInt(n[0]);
        int n2 = Integer.parseInt(n[1]);
        System.out.println(obj.findCubeSum(n1, n2));
    }
}
