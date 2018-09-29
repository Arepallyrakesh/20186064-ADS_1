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
            /*System.out.println(s);*/
        }
        return s;
    /*return null;*/
    }

    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
        Stack<Integer> stack1=new Stack<Integer>();
        Stack<Integer> stack2=new Stack<Integer>();
        for(int i=0; i < list1.size(); i++){
                stack1.push(Integer.valueOf((String) list1.get(i)));

        }
               System.out.println(stack1);

        for(int i=0; i < list2.size(); i++){

            stack2.push(Integer.valueOf((String) list2.get(i)));

        }
           System.out.println(stack2);
         LinkedList<Integer> list =new LinkedList<Integer>();
        int temp=0;
        while (!(stack1.empty()|| stack2.empty())) {
            int sum = temp + stack1.pop() + stack2.pop();
            if (stack1.empty()|| stack2.empty()) {
                
            }   
             list.push(sum);
        }

    return list;
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
