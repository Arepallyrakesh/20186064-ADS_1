import java.util.Scanner;
import java.util.*;
class AddLargeNumbers {
    
    public static LinkedList numberToDigits(String number) {
        LinkedList result = new LinkedList();
         String[] elements=number.split("");
        for (int i = 0; i<elements.length; i++) {
            /*System.out.println(number.charAt(i));*/
            result.add(elements[i]);
            
            /*System.out.print(Arrays.toString(result));*/
        }
        /*System.out.print(result.displayAll());*/
        /*System.out.println(result);*/

        return result;

    }


    public static String digitsToNumber(LinkedList list) {
        /*System.out.println(list);*/
        String s="";

        for(int i=0; i < list.size(); i++){

            s+=list.get(i);

        }

        return s;


    /*return null;*/
    }

    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
        /*System.out.println(list1.displayAll());
        System.out.println(list2.displayAll());*/

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
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                /*System.out.println(p);
                System.out.println(p.length());*/
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
               /* System.out.println(q);*/
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            case "addLargeNumbers":
                pDigits = AddLargeNumbers.numberToDigits(p);
                qDigits = AddLargeNumbers.numberToDigits(q);
                LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }
    
}
