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



		File dir = new File("D:/20186064-ADS_1/ADS-1_Assignments/remedial/Exam question/Exam question/Files");

		for (File file : dir.listFiles(new FilenameFilter() {
    public boolean accept(File dir, String name) {
        return name.toLowerCase().endsWith(".txt");

    }
})) {
			ArrayList<Integer> arrli = new ArrayList<Integer>();
			String str = "";
			String s4= "";
			int count = 0;
			int count1 = -1;
			try {
	    	s = new Scanner(file);
	    	 while (s.hasNextLine()) 
	    	 	str += s.nextLine() + "\n";
      			// System.out.println(s.nextLine());
	    	
	    	 String[] str1 = str.split(" ");
	    	 count1++;
      			//System.out.println(Arrays.toString(str1)); 
      			String Name = si;
				int index = -1;
				int i = 0;
				String s5 = "";
				for (i=0;i<str1.length;i++) {
				    if (str1[i].equals(Name)) {
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
				

			
				//System.out.println(ss.get("moana"));
				  
	}

		catch( Exception e) {
		System.out.println("file not found");
		}
			//System.out.println(str);
	

	    	s.close();
	}

	}
}