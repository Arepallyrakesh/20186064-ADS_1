import java.util.*;
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size=0;
		Jury[] jury = new Jury[11];
		Stack object = new Stack();
		while(sc.hasNext()) {
			String[] tokens = sc.next().split(",");
			//System.out.println(Arrays.toString(tokens));

			if (tokens[0].equals("JC")) {
				//System.out.println("no use");
				/*for (int i = 0; i < jury.lentgh ; i++) {
					int s = object.pop()
				}
*/
				/*int i = 0;
				object.pop();
				System.out.println(jury[i]);*/
			

				/*for (int i = 0; i < jury.length; i++) {
					if (jury[i+1] == jury[i]) {
						
		               for(int j=i; j<(jury.length-1); j++)
		               {
		                   jury[j] = jury[j+1];
		               }
					}
					if( jury[] == null) {
						System.out.print("no registrations found");
					}
				}*/

		    } else {
				jury[size++] = new Jury(Integer.parseInt(tokens[0]),Integer.parseInt(tokens[1]));
		    	//object.push(Integer.parseInt(tokens[1]));
		    }
		}

		//Insertion.sort(jury);
        print(jury);
        //System.out.println(Arrays.toString(jury));

	}
	public static void print(final Jury[] jury) {
        for (Jury jry : jury) {
            System.out.println(jry);

        }

    }
    /*public static void set(final Jury[] jury) {
    	int i = 0;
        int k = 0;
        int n = jury.length;
        System.out.println(n);
        Jury[] sett = new Jury[n];
        

    } */
}
class Jury implements Comparable<Jury> {
	private int rno;
	private int ino;
	Jury(int rno, int ino){
		this.rno = rno;
		this.ino = ino;
	}
	public int getRno() {
        return rno;
    }
    public void setRno(final int r) {
        this.rno = r;
    }
    public int getIno() {
        return ino;
    }
    public void setIno(final int i) {
        this.ino = i;
    }
    public int compareTo(final Jury that) {
        if (this.getIno() > that.getIno()) {
            return -1;
        }
        if (this.getIno() < that.getIno()) {
            return 1;
        }
        return 0;
    }
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(this.getRno() + ",");
        sb.append(this.getIno());
        return sb.toString();
    }

}
