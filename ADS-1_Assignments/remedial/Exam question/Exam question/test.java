import java.io.File; 
import java.util.Scanner; 
public class test 
{ 
  public static void main(String[] args) throws Exception 
  { 
    // pass the path to the file as a parameter 
   
          for (int i=0; i < 8 ; i++ ) {
    	Scanner sc = new Scanner(new File("D:/20186064-ADS_1/ADS-1_Assignments/remedial/Exam question/Exam question/Files"+i)); 
 
  
      System.out.println(i + "    "+sc.nextLine()); 
    	
    }
  } 
} 