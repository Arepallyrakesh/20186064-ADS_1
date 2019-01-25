import java.io.*; 
public class test 
{ 
  public static void main(String[] args) throws Exception 
  { 
    // pass the path to the file as a parameter 
    FileReader fr = 
      new FileReader("D:/20186064-ADS_1/ADS-1_Assignments/remedial/Exam question/Exam question/Files"); 
  
    int i; 
    while ((i=fr.read()) != -1) 
      System.out.print((char) i); 
  } 
} 