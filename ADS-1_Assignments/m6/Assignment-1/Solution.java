import java.util.Scanner;
import java.util.*;
class AddLargeNumbers {
    
    public static LinkedList1 numberToDigits(String number) {
    	LinkedList1 result = new LinkedList1();
    	for (int i = 0; i<number.length() ; i++) {
    		/*System.out.println(number.charAt(i));*/
    		result.push(number.charAt(i));
    		
    		/*System.out.print(Arrays.toString(result));*/
    	}
    	/*System.out.print(result.displayAll());*/
    	/*System.out.println(result);*/

    	return result;

    }


    public static String digitsToNumber(LinkedList1 list) {
    	/*System.out.println(list);*/
    	return list.displayAll();

    /*return null;*/
    }

    public static LinkedList1 addLargeNumbers(LinkedList1 list1, LinkedList1 list2) {
    	System.out.println(list1.displayAll());
    	System.out.println(list2.displayAll());

    return null;
	}
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch(input){
            case "numberToDigits":
                LinkedList1 pDigits = AddLargeNumbers.numberToDigits(p);
                /*System.out.println(p);
                System.out.println(p.length());*/
                LinkedList1 qDigits = AddLargeNumbers.numberToDigits(q);
               /* System.out.println(q);*/
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            case "addLargeNumbers":
                pDigits = AddLargeNumbers.numberToDigits(p);
                qDigits = AddLargeNumbers.numberToDigits(q);
                LinkedList1 result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }
    
}
