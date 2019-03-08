import java.util.*;
import java.util.TreeSet;
import java.util.PriorityQueue;
class Solution{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int n = Integer.parseInt(sc.nextLine());
		//TreeSet<Candidate> set = new TreeSet();
		MaxPQ<Candidate> max = new MaxPQ();
		while(sc.hasNext()){
			String[] s1 = sc.nextLine().split(" ");
			//System.out.println(Arrays.toString(s1));
			if (s1[0].equals("Apply") ) {
				String[] s2 = s1[1].split(",");
				//System.out.println(Arrays.toString(s2));
				//pq.insert(new Candidate(Integer.parseInt(s2[0]), s2[1], s2[2], Double.parseDouble(s2[3])));
				max.insert(new Candidate(Integer.parseInt(s2[0]), s2[1], s2[2], Double.parseDouble(s2[3])));
			} else if (s1[0].equals("Recruit_Top_Candidate")) {
				
				//System.out.println(Arrays.toString(s1));
				System.out.println(max.delMax());
			} else if (s1[0].equals("Ranking")) {
				//System.out.println(Arrays.toString(s1));
				System.out.println();
				int i = 1;
				while(!max.isEmpty()){
					System.out.println(i+": "+max.delMax());
					i++;
				}

				 
			}

			
		}
	}
}
class Candidate implements Comparable<Candidate>{
	int roll;
	String name;
	String dept;
	Double percentage;
	Candidate(int r, String n, String d, Double p){
		this.roll = r;
		this.name = n;
		this. dept = d;
		this.percentage = p;
	}
	int getroll(){
		return this.roll;
	}
	String getname(){
		return this.name;
	}
	String getdept(){
		return this.dept;
	}
	Double getpercent(){
		return this.percentage;
	}
	public int compareTo(Candidate that){
		if (this.getpercent().compareTo(that.getpercent()) > 0) {
			return 1;
		} else if (this.getpercent().compareTo(that.getpercent()) < 0) {
			return -1;
		} else{
			
				if (this.getroll() > that.getroll()) {
					return -1;
				} else if (this.getroll() < that.getroll()) {
					return 1;
				}
			
		}
		return -1;
	}
	public String toString(){
		return this.getroll()+","+this.getname()+","+this.getdept()+","+this.getpercent();
	}
}