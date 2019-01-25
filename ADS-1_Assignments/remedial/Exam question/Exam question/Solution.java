import java.util.*;
import java.util.Arrays;
// import java..*;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;

class Solution {
	public static void main(String[] args) {
		SequentialSearchST ss = new SequentialSearchST();
		SeparateChainingHashST sc = new SeparateChainingHashST();
		Scanner s = new Scanner(System.in);
		String si = s.next();



		File dir = new File("D:/20186064-ADS_1/ADS-1_Assignments/remedial/Exam question/Exam question/Files");

		for (File file : dir.listFiles(new FilenameFilter() {
    public boolean accept(File dir, String name) {
        return name.toLowerCase().endsWith(".txt");

    }
})) {
			String str = "";
			try {
	    	s = new Scanner(file);
	    	 while (s.hasNextLine()) 
	    	 	str += s.nextLine() + "\n";
      			// System.out.println(s.nextLine());
	    	 String[] str1 = str.split(" ");
      			//System.out.println(Arrays.toString(str1)); 
      			String Name = si;
				int index = -1;
				int i = 0;
				String s4= "";
				int count = 0;
				for (i=0;i<str1.length;i++) {
				    if (str1[i].equals(Name)) {
				        index = i;
				       s4 = i+", ";
				       System.out.print(s4);
				    }
				       //s4 = s4.substring(0, s4.length() - 1);
				    //ss.put(str1[i], i);
				    //ss.put(str1[i], i);
				        
				}
				      System.out.println();
			
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