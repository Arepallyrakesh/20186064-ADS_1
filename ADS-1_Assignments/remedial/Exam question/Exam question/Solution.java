import java.util.*;
import java.util.Arrays;
// import java..*;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;

class Solution {
	public static void main(String[] args) {
		SequentialSearchST ss = new SequentialSearchST();
		
		Scanner s = new Scanner(System.in);
		String si = s.next();
			ArrayList<Integer> arrli = new ArrayList<Integer>();
			
			String s4= "";
			int count = 0;
			int count1 = -1;
			
	    	 
      			//System.out.println(Arrays.toString(str1)); 
      			String Name = si;
				int index = -1;
				int i = 0;
				String s5 = "";
				try{


		for (int a = 0; a <= 8; a++)  {
			Scanner sc = new Scanner (new File("Files/"+a+".txt"));
			String[] str = sc.nextLine().split(" ");
	    	 count1++;

			for (i=0;i<str.length;i++) {
				    if (str[i].equals(Name)) {
				        index = i;
				        count++;
				       arrli.add(i);
				   	//	System.out.print(s4);
				    }
				}
				if (count > 0) {
					
				    System.out.println(count1+ ", " +count+", " +arrli);
				}
				//System.out.println(arrli); 
				}
				//System.out.println(ss.get("moana"));
				  
	
}
				 catch (Exception e) {
         
         System.out.println("no file found");
      }

			//System.out.println(str);
	

	    	s.close();
	}

	}