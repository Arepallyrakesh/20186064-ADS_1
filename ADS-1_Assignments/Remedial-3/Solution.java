
import java.util.*;
import java.text.Collator;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        BST<Integer, Student> bst1 = new BST<Integer, Student>();
        BST<Integer, Student> bst2= new BST<Integer, Student>();
        //LinearProbingHashST<Integer, Student> lst = new LinearProbingHashST<Integer, Student>();

        for (int i = 0; i < n ; i++) {
            String[] str = sc.nextLine().split(",");
            Student st = new Student(Integer.parseInt(str[0]), str[1], Double.parseDouble(str[2]));
            if (bst1.contains(Integer.parseInt(str[0]))) {
                //System.out.println("bst is   "+bst1.toString());
                bst2.put(Integer.parseInt(str[0]), st);
               // System.out.println("lst is the "+bst2.toString());
            } else {
                bst1.put(Integer.parseInt(str[0]), st);
            }
            //System.out.println(bst1.toString());
        }
        int m = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < m; i++) {
            Double number = Double.parseDouble(sc.nextLine());
            for (int s : bst1.keys()) {

                /*if(!bst1.containsValue(number){
                    System.out.println("not htere");
                }*/
                if (bst1.get(s).getmarks() == number) {
                    System.out.println(bst1.get(s));
                }
                if (bst2.contains(s)) {
                    if (bst1.get(s).getmarks() == number) {
                        System.out.println(bst1.get(s));
                    }
                } 
            }
        }
    }
}