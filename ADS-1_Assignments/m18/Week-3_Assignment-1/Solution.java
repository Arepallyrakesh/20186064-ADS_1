import java.util.*;
class Solution {
	public static void main(String[] args) {
		MinPQ<Stock> minpq = new MinPQ<Stock>();
        MaxPQ<Stock> maxpq = new MaxPQ<Stock>();
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		int m = Integer.parseInt(n);
		
                
		
		for (int i = 0; i < m ; i++) {
			String[] line1 = sc.nextLine().split(",");
			/*System.out.println(Arrays.toString(line1));*/
			 	maxpq.insert(new Stock(line1[0], Double.parseDouble(line1[1])));
                minpq.insert(new Stock(line1[0], Double.parseDouble(line1[1])));
               /* Stock result = maxpq.delMax();
                System.out.println(result.print());*/
                int top = 5;

            while (top > 0) {

                Stock result = maxpq.delMax();

                System.out.println(result.print());               
                top--;

            }
		}
              
		for (int j = m; j >= m && j < 2 * m; j++) {
			String[] line2 = sc.nextLine().split(",");
			/*System.out.println(Arrays.toString(line2));*/
			maxpq.insert(new Stock(line2[0], Double.parseDouble(line2[1])));
            minpq.insert(new Stock(line2[0], Double.parseDouble(line2[1])));
            /*Stock res = maxpq.delMax();

            System.out.println(res.print());*/
            int top = 5;

            while (top > 0) {

                Stock result = maxpq.delMax();

                System.out.println(result.print());               
                top--;

            }
            
			
		}
		
		for (int j = 2*m; j >= 2*m && j < 3 * m; j++) {
			String[] line3 = sc.nextLine().split(",");
			/*System.out.println(Arrays.toString(line3));*/
			maxpq.insert(new Stock(line3[0], Double.parseDouble(line3[1])));
            minpq.insert(new Stock(line3[0], Double.parseDouble(line3[1])));
            int top = 5;

            while (top > 0) {

                Stock result = maxpq.delMax();

                System.out.println(result.print());               
                top--;

            }
           
		}
		
		for (int j = 3 * m; j >= 3*m && j < 4 * m; j++) {
			String[] line4 = sc.nextLine().split(",");
			/*System.out.println(Arrays.toString(line4));*/
			maxpq.insert(new Stock(line4[0], Double.parseDouble(line4[1])));
            minpq.insert(new Stock(line4[0], Double.parseDouble(line4[1])));
            int top = 5;

            while (top > 0) {

                Stock result = maxpq.delMax();

                System.out.println(result.print());               
                top--;

            }
			
		}
		
		for (int j = 4* m; j >= 4 *m && j < 5 * m; j++) {
			String[] line5 = sc.nextLine().split(",");
			/*System.out.println(Arrays.toString(line5));*/
			maxpq.insert(new Stock(line5[0], Double.parseDouble(line5[1])));
            minpq.insert(new Stock(line5[0], Double.parseDouble(line5[1])));
            int top = 5;

            while (top > 0) {

                Stock result = maxpq.delMax();

                System.out.println(result.print());               
                top--;

            }
		}
		
		for (int j = 5*m; j >= 5*m && j < 6 * m; j++) {
			String[] line6 = sc.nextLine().split(",");
			maxpq.insert(new Stock(line6[0], Double.parseDouble(line6[1])));
            minpq.insert(new Stock(line6[0], Double.parseDouble(line6[1])));
            int top = 5;

            while (top > 0) {

                Stock result = maxpq.delMax();

                System.out.println(result.print());               
                top--;

            }
		}
		

		 


	}
}