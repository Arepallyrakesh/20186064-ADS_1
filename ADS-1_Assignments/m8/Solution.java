import java.util.Scanner;
import java.util.*;
class Team {
	String teamname;
	int wins;
	int loses;
	int draw;
	Team() { }
	Team(String[] inp) {
		teamname = inp[0];
		wins = Integer.parseInt(inp[1]);
		loses = Integer.parseInt(inp[2]);
		draw = Integer.parseInt(inp[3]);
	}
	String geteam() {
		return teamname;
	}
	void seteam(String tm) {
		teamname = tm;
	}

	int getwins() {
		return wins;
	}
	void sewins(int win)  {
		wins = win;
	}

	int getloses() {
		return loses;
	}
	void seloses(int lose)  {
		loses = lose;
	}

	int getdraw() {
		return draw;
	}
	void sedraw(int dr)  {
		draw = dr;
	}
	public String toString() {
		String str = "";
		str = geteam();
		return str;
	}
}
 class SelectionSort {
 	Team[] team;
 	int size;
 	SelectionSort(Team[] tm, int sz) {
 		team = tm;
 		size = sz;
 	}
 	Team[] sort() {
 		for (int i = 0; i < size - 1; i++) {
 			int max = i;
 			for (int j = i+1; j < size; j++) {
	 			if (team[j].getwins() > team[max].getwins()) {
	 				max = j;
	 			} else if (team[j].getwins() == team[max].getwins()) {
	 				if (team[j].getloses() < team[max].getloses()) {
	 					max = j;
	 				}
	 				if (team[j].getloses() == team[max].getloses()) {
	 					// System.out.println(team[max].geteam()+":team[max]----------------team[j]:"+team[j].geteam());
		 				if (team[j].getdraw() > team[max].getdraw()) {
		 					// System.out.println("****");
		 					max = j;
		 					}
		 				}
	 			}
 			}
 			Team temp = team[i];
 			team[i] = team[max];
 			team[max] = temp;
 		}
 		return team;
 	}

 }

class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Team[] tm = new Team[10];
		int size = 0;
        while (sc.hasNextLine()){
        	// System.out.println("in while");
	        String input = sc.nextLine();
			if (input.equals("")) {
				break;
			}
	        // System.out.println(input+":input");
	        String[] tokens =  input.split(",");
			tm[size++] = new Team(tokens);
    	}
    	// System.out.println("out while:");
    	SelectionSort select = new SelectionSort(tm, size);
    	tm = select.sort();
    	String str = "";
    	for (int i  = 0; i < size-1; i ++) {
    		str += tm[i].toString() + ",";
    	}
    	str += tm[size-1].toString();
    	System.out.println(str);
	}
}