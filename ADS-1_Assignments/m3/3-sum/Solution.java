import java.util.Scanner;
import java.util.Arrays;
public class Solution {
	public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int array = s.nextInt();
        int[] threesum = new int[array];
        for (int i = 0; i < array; i++) {
            threesum[i] = s.nextInt();
        }
        Arrays.sort(threesum);
        int count = 0;
        for (int i = 0; i < array - 2; i++) {
            int j = i + 1;
            int k = array - 1;
            while (j < k) {
                if (threesum[i] + threesum[j] + threesum[k] == 0) {
                    count++;
                    j++;
                    
                } else if (threesum[i] + threesum[j] + threesum[k] < 0) {
                    j++;

                } 
            }

        }
        System.out.println(count);

    }
}
