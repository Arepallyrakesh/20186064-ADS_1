import java.io.File; 
import java.util.Scanner; 
import java.util.Arrays;
public class test 
{ 
  public static void main(String[] args) throws Exception 
  { 
    // pass the path to the file as a parameter 
   
    for (int i = 0; i <= 8; i++) {
		Scanner sc = new Scanner (new File("Files/"+i+".txt"));
		String[] str = sc.nextLine().split(" ");
		//System.out.println(i + Arrays.toString(str));
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
